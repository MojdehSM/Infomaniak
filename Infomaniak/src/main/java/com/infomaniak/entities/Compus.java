package com.infomaniak.entities;

import java.util.ArrayList;

public class Compus {

	String compusCity;
	String compusRegion;
	int CapCompus;
	ArrayList<Student> students;

	public String getCompusCity() {
		return compusCity;
	}

	public String getCompusRegion() {
		return compusRegion;
	}

	public int getCapCompus() {
		return CapCompus;
	}

	public void addStudent(Student s) throws Exception{
		if (CapCompus > 0) {
			students.add(s);
		} else {
			throw new IllegalArgumentException("Capacity of Compus : " 
                    +getCapCompus());
		}
		
	}

}
