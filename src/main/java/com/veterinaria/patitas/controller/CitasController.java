package com.veterinaria.patitas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CitasController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
