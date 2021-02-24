package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.api.CarSrviceAPI;


@Service
public class CarServiceImp implements CarSrviceAPI {

	@Autowired
	private CarRepository carRepository;
	
	
	@Override
	public Page<Car> gettAll(Pageable pageable) {
		return carRepository.findAll(pageable);
	}

	
	
}
