package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Direccion;
import com.example.demo.repository.DireccionRespository;
import com.example.demo.service.api.DireccionServiceAPI;

@Service
public class DireccionServiceImpl implements DireccionServiceAPI {

	@Autowired
	private DireccionRespository direccionRepository;
	
	
	@Override
	public Page<Direccion> gettAll(Pageable pageable) {
		return direccionRepository.findAll(pageable);
	}

}
