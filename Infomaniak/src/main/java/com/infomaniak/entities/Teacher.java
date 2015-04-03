package com.infomaniak.entities;

public class Teacher {

	String prenomT;
	String nomT;
	int idT;

	public Teacher(String tp, String tn, int tid) {
		this.prenomT = tp;
		this.nomT = tn;
		this.idT = tid;
	}

	public String getNomT() {
		return nomT;
	}

	public String getPrenomT() {
		return prenomT;
	}

	public int getIdT() {
		if (this.idT == 0) {
			System.out.println("Teacher " + this.getPrenomT() + " "
					+ this.getNomT() + " doesn't have a ID");
		}
		return idT;
	}

	@Override
	public String toString() {
		return "TeacherPrenom :" + getPrenomT() + ", TeacherNom :" + getNomT()
				+ ", TeacherID :" + getIdT() + ", TeacherType :"
				+ this.getClass();
	}
}
