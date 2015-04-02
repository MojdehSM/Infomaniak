package com.infomaniak.entities;

public class Student {

	String prenomS;
	String nomS;
	int idS;

	public String getPrenomS() {
		return prenomS;
	}

	public String getNomS() {
		return nomS;
	}

	public int getIdS() {
		return idS;
	}
	
	@Override
	   public String toString(){
	      return "StudentPrenom :"+getPrenomS()+", StudentNom :"+getNomS()+ "StudentID :"+getIdS();
	   }

}
