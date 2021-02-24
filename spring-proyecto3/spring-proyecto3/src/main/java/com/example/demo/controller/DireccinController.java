package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DireccinController {

	@Autowired
	private DireccionSrviceAPI DireccionServiceAPI;
	
	@GetMapping(value = "/Direccions")
	public String finnAll (@RequestParam Map <String, Object> params, Model model){
		int page = params.get("page") !=null ? (Integer.valueOf(params.get("page").toString()) - 1) : 0;
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Direccion> pageDireccion = DireccionServiceAPI.gettAll(pageRequest);
		
		int totalPage =  pageDireccion.getTotalPages();
		if (totalPage >0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());		
			model.addAttribute("pages", pages);		
		}
		model.addAttribute("list", pageDireccion.getContent());

		return "index";
	}
	
}
