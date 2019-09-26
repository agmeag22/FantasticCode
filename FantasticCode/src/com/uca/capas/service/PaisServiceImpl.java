package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Paises;
import com.uca.capas.repositories.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	PaisRepository paisRepository;

	public List<Paises> findAll() {
		// TODO Auto-generated method stub
		return paisRepository.findAll();
	}

}
