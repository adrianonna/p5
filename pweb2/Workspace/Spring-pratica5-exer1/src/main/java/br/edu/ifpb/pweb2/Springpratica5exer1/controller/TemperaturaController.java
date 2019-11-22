package br.edu.ifpb.pweb2.Springpratica5exer1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/converter")
public class TemperaturaController {

	private double temperatura;
	@RequestMapping(method = RequestMethod.POST)
	public String converterTemperatura(String tempC) {
		System.out.println(Double.parseDouble(tempC));
		return "redirect:converter";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String converterTemperaturaGet() {
		return "conversor";
	}
	
}
