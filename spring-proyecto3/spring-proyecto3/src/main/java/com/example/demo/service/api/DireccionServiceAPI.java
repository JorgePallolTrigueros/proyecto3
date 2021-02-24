package com.example.demo.service.api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.entities.Car;
import com.example.demo.entities.Direccion;

public interface DireccionServiceAPI {
	Page<Direccion> gettAll (Pageable pageable);
}



