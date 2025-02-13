package com.veterinaria.patitas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CitasController {
	
	@GetMapping("/")
	public String index() {
		log.info("index.html");
		return "index";
	}
}
