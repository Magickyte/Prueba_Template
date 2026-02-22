package com.fing.app.controllers;



import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fing.app.models.Bounce;
import com.fing.app.models.Orden;
import com.fing.app.models.User;
import com.fing.app.models.Visitor;

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
		
		ArrayList<Visitor> lista4 = new ArrayList<>();
		lista4.add(new Visitor("Fernanda",2));
		lista4.add(new Visitor("Jose",3));
		lista4.add(new Visitor("Alejandro",15));
		lista4.add(new Visitor("Ricardo",4));
		lista4.add(new Visitor("Ian",17));
		lista4.add(new Visitor("Ivan",20));
		lista4.add(new Visitor("Valeria",55));
		lista4.add(new Visitor("Isabella",100));
		lista4.add(new Visitor("Sofia",5));
		lista4.add(new Visitor("Laura",25));
		lista4.add(new Visitor("Pepe",1));
		
		
		
		model.addAttribute("ordenes",lista);
		
		model.addAttribute("porcentajes", lista2);
		
		model.addAttribute("usuarios", lista3);
		
		model.addAttribute("visitors", lista4);
		
		model.addAttribute("msg", "Hola");
		 
		
		 return "index";
	}
	
	
	
	
	
	
	
}
