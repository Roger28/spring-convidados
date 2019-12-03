package com.rwork.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rwork.festa.entities.Convidado;
import com.rwork.festa.repository.ConvidadoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		Convidado convidado = new Convidado(null, "Roger", 3);
		Convidado convidado2 = new Convidado(null, "Roger", 3);
		Convidado convidad3 = new Convidado(null, "Roger", 3);
		Convidado convidado4 = new Convidado(null, "Roger", 3);
		this.repository.saveAll(Arrays.asList(convidado, convidado2, convidad3, convidado4));
		
	}
	
	@Autowired
	private ConvidadoRepository repository;
}
