package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.api.CarSrviceAPI;



@Controller
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	
	@Autowired
	private CarSrviceAPI carServiceAPI;
	
	@GetMapping(value = "/cars")
	public String finnAll (@RequestParam Map <String, Object> params, Model model){
		int page = params.get("page") !=null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Car> pageCar = carServiceAPI.gettAll(pageRequest);
		
		int totalPage =  pageCar.getTotalPages();
		if (totalPage >0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());		
			model.addAttribute("pages", pages);		
		}
		model.addAttribute("list", pageCar.getContent());

		return "index";
	}
	

	
	@GetMapping(value = "/cars_ensueno")
	public  String  coche_ensueno (@RequestParam Map <String, Object> params, Model model){
		return "cochensueno";
	
		
	}
	
	
	
	
	

	
	
	
	
	
	@GetMapping(value = "/cocheensueno")
	public  String  coche_ensueno_creado (@PathVariable Car car, HttpSession session){
		
		double finalPrice = 15000;
		String formselect3="";
		String formselect1="";
		String formselect="";
		
		// Primer Select
				if (car.getCc()>1.4) {
					finalPrice +=500;
					primerselect	= "Marca 1";
				}
				else if (car.getCc()>1.5) {
					finalPrice +=900;
					primerselect	= "Marca 2";
				}
				else if(car.getCc()>1.8) {
					finalPrice +=1500;
					primerselect = "Marca 3";
				}
		
		// Segundo Select
				if (car.getCc()>1.4) {
					finalPrice +=500;
					primerselect	= "Color:";
				}
				else if (car.getCc()>1.5) {
					finalPrice +=900;
					primerselect	= "Color:";
				}
				else if(car.getCc()>1.8) {
					finalPrice +=1500;
					primerselect = "Color";
				}
			 
		
		// Tercero Select
				if (car.getCc()==1) {
					finalPrice +=500;
					primerselect	= "Acabado 1";
				}
				else if (car.getCc()>1.5) {
					finalPrice +=900;
					primerselect	= "Acabado 2";
				}
				else if(car.getCc()>1.8) {
					finalPrice +=1500;
					primerselect = "Acabado 3";
				}
		
		//Hacer el to string para mandarlo con 
			
				String resultado ="El coche que nos has pedido tiene las siguientes prestaciones marca \"+form-select+\" "
							+ "color \"+form-select2+\" acabado:\"+form-select3+\" y el coste es:\"+finalPrice+\"   ";
			
				
		//		
		
		return "resultado";
		//double finalPrice = 15000;
		
	}
	
	
	// TODO - recuperar uno, crear, editar, borrar
	
}
