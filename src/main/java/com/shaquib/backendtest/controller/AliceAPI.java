package com.shaquib.backendtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shaquib.backendtest.model.PsyForm;
import com.shaquib.backendtest.serviceimplementation.PsyFormServicesImp;


@RestController

@CrossOrigin("*")

public class AliceAPI {
	
	@Autowired
	private PsyFormServicesImp psyServiceImpl;
	
	@PostMapping(value="savePsyForm")
	public PsyForm savePsyForm(@RequestBody PsyForm data) {
		System.out.println("Successfully save!!");
		psyServiceImpl.savePsyForm(data);
		return data;
	}
	
	
	@GetMapping(value = "getAllPsyForm")
	public List<PsyForm> findAllPsyForm(){
		return psyServiceImpl.findAllPsyForms();
	}
	
	@PutMapping("updatePsyForm")
	public PsyForm updatePsyForm(@RequestBody PsyForm data) {
		//System.out.println("Successfully update!!");
		psyServiceImpl.updatePsyForm(data);
		return data;
	}
	
	@DeleteMapping("deletePsyForm")
	public String deletePsyForm(@RequestParam int id) {
		//System.out.println("Successfully update!!");
		psyServiceImpl.deletePsyForm(id);
		return "Successfully Deleted!!";
	}
}
