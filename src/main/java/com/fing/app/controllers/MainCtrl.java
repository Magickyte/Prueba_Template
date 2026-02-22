package com.fing.app.controllers;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fing.app.models.Orden;

@Controller
public class MainCtrl {
	
	
	@GetMapping("/")
	public String raiz(Model model) {
		
		
		ArrayList<Orden> lista = new ArrayList<>();
		lista.add(new Orden());	
		lista.add(new Orden());	
		lista.add(new Orden());	
		
		model.addAttribute("ordenes",lista);
		 model.addAttribute("msg", "Hola");
		 
		
		 return "index";
	}
	
	
	
	
	
	
	
}
