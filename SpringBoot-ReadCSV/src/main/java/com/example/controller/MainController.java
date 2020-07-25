package com.example.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.Student;
import com.example.repo.StudentRepo;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Controller
public class MainController 
{
	@Autowired
	private StudentRepo studentRepo;

	public MainController(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
												//Goto index Page
	@RequestMapping("/")
	public String view()
	{
		return "index";
	}
												//Goto insertPage
	@RequestMapping("/insert")
	public String view1()
	{
		return "insertPage";
	}
												//Save Student Record
	@RequestMapping("/add")
	public String view2(Student stud, Model m)
	{
		studentRepo.save(stud);
		m.addAttribute("msg","Record insert successfully...");
		return "insertPage";
	}
												//Display Student All Record
	@RequestMapping("/display")
	public String view3(Model m)
	{
		List list = studentRepo.findAll();
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
		}
		else {
			m.addAttribute("msg","Sorry record not found!");
		}
		return "displayPage";
	}
	
	@RequestMapping("/viewSCV")
	public String view4()
	{
		return "uploadCSVPage";
	}
	
	@RequestMapping(value="/upload/csvFile", method = RequestMethod.POST)
	public String view5(@RequestParam("file")MultipartFile file, Model m)
	{
		if(!file.isEmpty())
		{
			try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream())))
			{
				CsvToBean<Student> csvTobean = new CsvToBeanBuilder(reader)
						.withType(Student.class)
						.withIgnoreLeadingWhiteSpace(true)
						.build();
				List<Student> list = csvTobean.parse();
				m.addAttribute("data", list);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			m.addAttribute("msg", "Please select CSV file to upload!");
		}
		return "readCSvPage";
	}
}
