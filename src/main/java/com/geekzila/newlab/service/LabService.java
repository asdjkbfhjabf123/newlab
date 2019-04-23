package com.geekzila.newlab.service;

import java.util.List;

import com.geekzila.newlab.model.Lab;

public interface LabService {

	public List<Lab> findAll();

	public void add(Lab lab);

	public Lab get(String name);

	public void delete(String name);

}
