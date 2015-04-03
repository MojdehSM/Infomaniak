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
			System.out.println("Student " + s.getPrenomS() + " " + s.getNomS()
					+ " est ajouté a Compus " + this.getCompusCity());
		} else if (capCompus == 0) {

			System.out.println("Student " + s.getPrenomS() + " " + s.getNomS()
					+ " n'est pas ajouté a Compus " + this.getCompusCity());
			new FullCampusException(
					"There isn't place beacuse Capacity of Compus is :"
							+ getCapCompus());
		}
	}

	public void removeStudent(Student s) {
		studentsC.remove(s);
		capCompus = capCompus + 1;
		System.out.println("Student " + s.getPrenomS() + " " + s.getNomS()
				+ " est sorti de Compus " + this.getCompusCity());
	}

	public void getStudents() {
		if (studentsC != null & !studentsC.isEmpty()) {
			for (Student stud : studentsC)
				System.out.println(stud.toString());
		} else {
			System.out.println("There isn't student in compus "
					+ this.getCompusCity());
		}

	}

	public void addTeacher(Teacher t) {
		teachersC.add(t);
		System.out.println("Teacher " + t.getPrenomT() + " " + t.getNomT()
				+ " est ajouté a Compus " + this.getCompusCity());
	}

	public void removeTeacher(Teacher t) {
		teachersC.remove(t);
		System.out.println("Teacher " + t.getPrenomT() + " " + t.getNomT()
				+ " est sorti de Compus " + this.getCompusCity());
	}

	public void getTeachers() {
		if (teachersC != null & !teachersC.isEmpty()) {
			for (Teacher tea : teachersC)
				System.out.println(tea.toString());
		} else {
			System.out.println("There isn't teacher in compus "
					+ this.getCompusCity());
		}

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
