package com.cibertec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cibertec.entity.Administrado;
import com.cibertec.service.AdministradoService;

@Controller
public class AdministradoController {

	@Autowired
	public AdministradoService service;

	@GetMapping(value = "/verAdmi")
	public String ver() {
		return "RegistroAdmi";
	}

	@PostMapping("/registroAdmi")
	@ResponseBody
	public Map<?, ?> registra(Administrado admi) {
		HashMap<String, String> map = new HashMap<String, String>();
		service.registroAdmi(admi);
		if (admi == null) {
			map.put("MENSAJE", "Error en el registro");
		} else {
			map.put("MENSAJE", "Administrado registrado Correctamente");
		}
		return map;
	}

}
