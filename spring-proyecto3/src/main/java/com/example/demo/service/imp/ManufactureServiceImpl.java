package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Direccion;
import com.example.demo.entities.Manufacture;
import com.example.demo.repository.DireccionRespository;
import com.example.demo.repository.ManufactureRepository;
import com.example.demo.service.api.ManufactureServiceAPI;

@Service
public class ManufactureServiceImpl implements ManufactureServiceAPI{





@Autowired
private ManufactureRepository manufactureRepository;


@Override
public Page<Manufacture> gettAll(Pageable pageable) {
	return manufactureRepository.findAll(pageable);
}

}

