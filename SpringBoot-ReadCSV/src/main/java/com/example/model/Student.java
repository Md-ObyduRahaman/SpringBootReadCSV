package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindAndJoinByName;
import com.opencsv.bean.CsvBindByName;
@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@CsvBindByName
	private long id;
	@CsvBindByName
	private int roll;
	@CsvBindByName(column = "name")
	private String sname;
	@CsvBindByName
	private String address;
	
	public Student() {}

	public Student(long id, int roll, String sname, String address) {
		super();
		this.id = id;
		this.roll = roll;
		this.sname = sname;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", sname=" + sname + ", address=" + address + "]";
	}
}
