package com.infomaniak.entities;

public class Student {

	String prenomS;
	String nomS;
	int idS;

	public Student(String ps, String ns, int ids) {
		this.prenomS = ps;
		this.nomS = ns;
		this.idS = ids;
	}

	public String getPrenomS() {
		return prenomS;
	}

	public String getNomS() {
		return nomS;
	}

	public int getIdS() {
		if (this.idS == 0) {
			System.out.println("Student " + this.getPrenomS() + " "
					+ this.getNomS() + " doesn't have a ID");
		}
		return idS;
	}

	@Override
	public String toString() {
		return "StudentPrenom :" + getPrenomS() + ", StudentNom :" + getNomS()
				+ ", StudentID :" + getIdS();
	}

}
