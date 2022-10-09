package com.shaquib.backendtest.serviceinterface;

import java.util.List;

import com.shaquib.backendtest.model.PsyForm;

public interface PsyFormInterface {

	public PsyForm savePsyForm(PsyForm data);

	public PsyForm updatePsyForm(PsyForm data);

	public List<PsyForm> findAllPsyForms();
	
	public void deletePsyForm(int id);

}
