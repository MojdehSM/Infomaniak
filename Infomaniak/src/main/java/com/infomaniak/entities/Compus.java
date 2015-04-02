package com.infomaniak.entities;

import java.util.ArrayList;

public class Compus {

	String compusCity;
	String compusRegion;
	int capCompus;
	ArrayList<Student> studentsC;
	ArrayList<Teacher> teachersC;

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

	public class FullCampusException extends RuntimeException {

		public FullCampusException() {
			super();
		}

		public FullCampusException(String s) {
			super(s);
		}
	}

	@Override
	public String toString() {
		return "CompusVille :" + getCompusCity() + ", CompusRegion :"
				+ getCompusRegion() + ", compusCapacité :" + getCapCompus();
	}
}
