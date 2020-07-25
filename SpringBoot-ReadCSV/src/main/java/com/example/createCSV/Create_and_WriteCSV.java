package com.example.createCSV;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.example.model.Student;
import com.opencsv.CSVWriter;

public class Create_and_WriteCSV 
{
	public static void writeDataToCsvUsingArray(PrintWriter writer, List<Student> students) throws IOException
	{
		String[] CSV_HEADER = {"Roll","Name","Address"};
		try (
			CSVWriter csvWriter = new CSVWriter(writer,
					CSVWriter.DEFAULT_SEPARATOR,
					CSVWriter.NO_QUOTE_CHARACTER,
					CSVWriter.DEFAULT_ESCAPE_CHARACTER,
					CSVWriter.DEFAULT_LINE_END
					);
		){
			csvWriter.writeNext(CSV_HEADER);
			for(Student stud: students)
			{
				String str;
				String[] data = {
						str = String.valueOf(stud.getRoll()),
						stud.getSname(),
						stud.getAddress()
				};
				csvWriter.writeNext(data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
