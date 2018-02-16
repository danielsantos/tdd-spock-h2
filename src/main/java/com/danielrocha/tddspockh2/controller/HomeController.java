package com.danielrocha.tddspockh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danielrocha.tddspockh2.repository.UsuarioRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UsuarioRepository repository;

	@RequestMapping
	public void index() {
		System.out.println(repository.findOne(1l).getNome());
	}
	
}
