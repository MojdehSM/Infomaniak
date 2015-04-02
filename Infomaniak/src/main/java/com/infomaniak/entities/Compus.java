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

	public void getStudent() {
		for (Student stud : students) {

			System.out.println();
		}
	}

}
