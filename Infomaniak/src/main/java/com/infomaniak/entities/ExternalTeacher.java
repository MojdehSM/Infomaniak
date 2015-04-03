package com.infomaniak.entities;

public class ExternalTeacher extends Teacher {

	public ExternalTeacher(String tp, String tn, int tid) {
		super(tp, tn, tid);
	}

	int salaireET;

	public int getSalaireET() {
		return salaireET;
	}

}
