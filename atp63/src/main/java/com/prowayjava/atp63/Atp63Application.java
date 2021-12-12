package com.prowayjava.atp63;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prowayjava.atp63.model.Agencia;
import com.prowayjava.atp63.model.Cliente;
import com.prowayjava.atp63.repository.AgenciaRepository;
import com.prowayjava.atp63.repository.ClienteRepository;

@SpringBootApplication
public class Atp63Application implements CommandLineRunner {
	
	private ClienteRepository clientenRepository;
	private AgenciaRepository agenciaRepository;
	
	public Atp63Application(ClienteRepository clienteRepository, AgenciaRepository agenciaRepository) {
		this.clientenRepository = clienteRepository;
		this.agenciaRepository = agenciaRepository;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Atp63Application.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("ATP63");
		
		clientenRepository.save(cliente);
		
		clientenRepository.findAll().forEach(c -> System.out.printf("ID: %d | Cliente: %s\n", c.getId(), c.getNome()));
		
		Agencia agencia = new Agencia();
		agencia.setAgencia("001");
		agencia.setConta("666");
		
		agenciaRepository.save(agencia);
		
		agenciaRepository.findAll().forEach(a -> System.out.printf("ID: %d | Agencia: %s | Conta: %s\n", a.getId(), a.getAgencia(), a.getConta()));
		
		}

}
