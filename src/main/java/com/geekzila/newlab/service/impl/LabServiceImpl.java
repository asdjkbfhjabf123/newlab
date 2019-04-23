package com.geekzila.newlab.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.newlab.model.Lab;
import com.geekzila.newlab.service.LabService;

public class LabServiceImpl implements LabService {

	public List<Lab> labs = new ArrayList<Lab>();

	public LabServiceImpl() {

		labs.add(new Lab("Physics"));

	}

	public void add(Lab lab) {
		labs.add(lab);
	}

	public Lab get(String name) {
		for (Lab lab : labs) {

			if (lab.getName().equals(name)) {

				return lab;
			}
		}
		return null;
	}

	public void delete(String name) {
		Lab labFromDb = get(name);
		labs.remove(labFromDb);
	}

	public List<Lab> findAll() {
		// TODO Auto-generated method stub
		return labs;
	}

}
