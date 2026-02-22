package com.fing.app.controllers;



import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fing.app.models.Bounce;
import com.fing.app.models.Orden;
import com.fing.app.models.User;

@Controller
public class MainCtrl {
	
	
	@GetMapping("/")
	public String raiz(Model model) {
		
		
		ArrayList<Orden> lista = new ArrayList<>();
		lista.add(new Orden(10234));	
		lista.add(new Orden(10433));	
		lista.add(new Orden(10349));
		lista.add(new Orden(9999));	
		lista.add(new Orden(1121));	
		
		ArrayList<Bounce> lista2 = new ArrayList<>();
		
		lista2.add(new Bounce(11.2));
		lista2.add(new Bounce(5.8));
		lista2.add(new Bounce(99.9));
		lista2.add(new Bounce(0.1));
		
		
		ArrayList<User> lista3 = new ArrayList<>();
		
		lista3.add(new User("Juan","Perez"));
		lista3.add(new User("Maria","Lopez"));
		lista3.add(new User("Carlos","Torres"));
		lista3.add(new User("Natalia","Reyes"));
		lista3.add(new User("Miguel","Sanchez"));
		lista3.add(new User("Camila","Rivera"));
		lista3.add(new User("Angel","Rodriguez"));
		
		model.addAttribute("ordenes",lista);
		
		model.addAttribute("porcentajes", lista2);
		
		model.addAttribute("usuarios", lista3);
		
		 model.addAttribute("msg", "Hola");
		 
		
		 return "index";
	}
	
	
	
	
	
	
	
}
