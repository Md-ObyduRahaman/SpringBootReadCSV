package com.example.writeRestController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.createCSV.Create_and_WriteCSV;
import com.example.model.Student;
import com.example.repo.StudentRepo;

@RestController
public class DownloadCSVRestController 
{
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("/download/student.csv")
	public void downloadCSV(HttpServletResponse response)throws IOException
	{
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; file = student.csv");
		List<Student> list = (List<Student>) studentRepo.findAll();
		Create_and_WriteCSV.writeDataToCsvUsingArray(response.getWriter(), list);
	}
}
