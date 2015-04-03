package com.infomaniak.entities;

import java.util.ArrayList;

import com.infomaniak.exceptions.FullCampusException;

public class Compus {

	String compusCity;
	String compusRegion;
	int capCompus;
	ArrayList<Student> studentsC = new ArrayList<>();
	ArrayList<Teacher> teachersC = new ArrayList<>();

	public Compus(String cC, String cR, int capC) {
		this.compusCity = cC;
		this.compusRegion = cR;
		this.capCompus = capC;
	}

	public void addStudent(Student s) throws FullCampusException {
		if (capCompus > 0) {
			studentsC.add(s);
			capCompus = capCompus - 1;
		} else {
			new FullCampusException("Capacity of Compus :" + getCapCompus());
		}
	}

	public void removeStudent(Student s) {
		studentsC.remove(s);
		capCompus = capCompus + 1;
	}

	// a completer!!!!!!!
	public Student getStudents() {
		return null;
	}

	public String getCompusCity() {
		return compusCity;
	}

	public String getCompusRegion() {
		return compusRegion;
	}

	public void setCapCompus(int capC) {
		capCompus = capC;
	}

	public int getCapCompus() {
		return capCompus;
	}

	@Override
	public String toString() {
		return "CompusVille :" + getCompusCity() + ", CompusRegion :"
				+ getCompusRegion() + ", compusCapacité :" + getCapCompus();
	}
}
