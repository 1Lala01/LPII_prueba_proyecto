package com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebaController {
	
	@GetMapping(value = "/verprueba")
	public String ver() {
		return "prueba";
	}
}
