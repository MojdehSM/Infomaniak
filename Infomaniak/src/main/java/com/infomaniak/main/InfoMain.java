package com.infomaniak.main;

import com.infomaniak.entities.Compus;
import com.infomaniak.entities.ExternalTeacher;
import com.infomaniak.entities.Student;
import com.infomaniak.entities.Teacher;

public class InfoMain {

	public static void main(String[] args) {

		Compus compusTriolet = new Compus("Montpellier", "Languedoc", 3);
		// System.out.println(compusTriolet.toString());

		Student moi = new Student("Mojdeh", "SoltanMohammadi", 20117842);
		// System.out.println(moi.toString());

		Student rabah = new Student("Rabah", "Laouadi", 20117040);
		Student mahshad = new Student("Mahshad", "Soltan", 20142654);
		Student lui = new Student("Yohan", "Fredric", 0);
		System.out.println(lui.toString());
		// compusTriolet.addStudent(moi);
		// compusTriolet.addStudent(rabah);
		// compusTriolet.addStudent(mahshad);
		// compusTriolet.addStudent(lui);

		// compusTriolet.removeStudent(mahshad);
		// compusTriolet.addStudent(lui);

		// compusTriolet.getStudents();

		ExternalTeacher mougenot = new ExternalTeacher("Isabelle", "Mougenot",
				20115847);
		System.out.println(mougenot.toString());

		compusTriolet.addTeacher(mougenot);
		compusTriolet.removeTeacher(mougenot);
		compusTriolet.getTeachers();

	}

}
