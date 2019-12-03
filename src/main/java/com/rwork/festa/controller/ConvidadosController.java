package com.rwork.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rwork.festa.entities.Convidado;
import com.rwork.festa.services.ConvidadoService;


@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadoService service;

	@GetMapping
	public ModelAndView listar() {	
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject(new Convidado());
		modelAndView.addObject("convidados", this.service.findAll());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		return this.service.salvar(convidado);
	}
}
