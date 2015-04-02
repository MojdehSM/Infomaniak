package com.infomaniak.main;

import com.infomaniak.entities.Compus;
import com.infomaniak.entities.Student;

public class InfoMain {
	
	public static void main(String[] args) {
	
			Compus compusTriolet= new Compus("Montpellier", "Languedoc", 3);
			Student moi= new Student("Mojdeh", "SoltanMohammadi", 20117842);
			compusTriolet.toString();
			moi.toString();
			//compusTriolet.addStudent(moi);
			
			
			
	}

}
