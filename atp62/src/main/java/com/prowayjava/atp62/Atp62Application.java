package com.prowayjava.atp62;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prowayjava.atp62.model.Cliente;
import com.prowayjava.atp62.repository.ClienteRepository;

@SpringBootApplication
public class Atp62Application implements CommandLineRunner {
	
	//CommandLineRunner - interface para executar linha de comando fora da main
	
	private ClienteRepository repository;
	
	public Atp62Application(ClienteRepository repository) {
		this.repository = repository;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Atp62Application.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		Cliente model = new Cliente();
		model.setNome("Cliente 1");
		
		Cliente model2 = new Cliente();
		model2.setNome("Teste 2");
		
		repository.save(model2);
		
		repository.findAll().forEach(c -> System.out.printf("ID: %d | Cliente: %s\n", c.getId(), c.getNome()));
	}

}
