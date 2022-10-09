package com.shaquib.backendtest.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaquib.backendtest.dao.PsyFormRepository;
import com.shaquib.backendtest.model.PsyForm;
import com.shaquib.backendtest.serviceinterface.PsyFormInterface;

@Service
public class PsyFormServicesImp implements PsyFormInterface {
	@Autowired
	private PsyFormRepository psyrepo;
	

	@Override
	public PsyForm savePsyForm(PsyForm data) {
		// TODO Auto-generated method stub
		return psyrepo.save(data);
	}

	@Override
	public PsyForm updatePsyForm(PsyForm data) {
		// TODO Auto-generated method stub
		return psyrepo.save(data);
	}

	@Override
	public List<PsyForm> findAllPsyForms() {
		// TODO Auto-generated method stub
		return (List<PsyForm>) psyrepo.findAll();
	}

	@Override
	public void deletePsyForm(int id) {
		psyrepo.deleteById(id);;
		
		
	}
	
	
	
}
