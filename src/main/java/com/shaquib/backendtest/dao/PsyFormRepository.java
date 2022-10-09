package com.shaquib.backendtest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shaquib.backendtest.model.PsyForm;

@Repository
public interface PsyFormRepository extends CrudRepository<PsyForm, Integer>{

	
}

