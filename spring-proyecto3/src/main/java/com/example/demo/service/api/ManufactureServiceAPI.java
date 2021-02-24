package com.example.demo.service.api;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;

import com.example.demo.entities.Manufacture;
public interface ManufactureServiceAPI {
	Page<Manufacture> gettAll (Pageable pageable);
}




