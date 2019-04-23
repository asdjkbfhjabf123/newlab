package com.geekzila.newlab;

import java.util.List;

import com.geekzila.newlab.model.Lab;
import com.geekzila.newlab.service.LabService;
import com.geekzila.newlab.service.impl.LabServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LabService labService = new LabServiceImpl();

		List<Lab> labs = labService.findAll();

		for (int i = 0; i < labs.size(); i++) {
			Lab lab = labs.get(i);
			System.out.println("Name: " + lab.getName());
		}

		System.out.println("Let's add new Labs!!!!!!");

		Lab chem = new Lab("Chemistry");

		System.out.println("We have added successfully: " + chem.getName());

		System.out.println("Remove any one lab.....");

		labService.delete("Physics");
		
		Lab labFromDb = new Lab("physics");

		for (int i = 0; i < labs.size(); i++) {
			Lab lab = labs.get(i);
			System.out.println("This lab is been deleted: " + lab.getName());
		}

	}
}
