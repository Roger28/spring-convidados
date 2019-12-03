package com.rwork.festa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rwork.festa.entities.Convidado;
import com.rwork.festa.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;

	public List<Convidado> findAll() {
		return this.repository.findAll();
	}
	
	public String salvar(Convidado convidado) {
		this.repository.save(convidado);
		return "redirect:/convidados";
	}
}
