package com.example.demo.controller;

import java.util.stream.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Car;
import com.example.demo.entities.Manufacture;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.api.CarSrviceAPI;

@Controller
public class ManudactureController {

	@Autowired
	private ManufactureSrviceAPI ManufactureServiceAPI;
	
	@GetMapping(value = "/Manufactures")
	public String finnAll (@RequestParam Map <String, Object> params, Model model){
		int page = params.get("page") !=null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Manufacture> pageManufacture = ManufactureServiceAPI.gettAll(pageRequest);
		
		int totalPage =  pageManufacture.getTotalPages();
		if (totalPage >0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());		
			model.addAttribute("pages", pages);		
		}
		model.addAttribute("list", pageManufacture.getContent());

		return "index";
	}
	
}