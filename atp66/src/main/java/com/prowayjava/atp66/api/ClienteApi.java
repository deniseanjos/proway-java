package com.prowayjava.atp66.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowayjava.atp66.model.Cliente;
import com.prowayjava.atp66.repository.ClienteRepository;

@RestController
public class ClienteApi {
	
	@Autowired //Não precisa do construtor para iniciar, injeção de dependencia
 	private ClienteRepository repository;

	
	@GetMapping("/api/cliente")
	public List<Cliente> clientes() {
		List<Cliente> lista = (List<Cliente>)repository.findAll();
		return lista;
	}
	
	@PostMapping("/api/cliente")
	public String salvar(@RequestBody Cliente model) {
		repository.save(model);
		return "Salvo com sucesso";
	}
	
	@DeleteMapping("/api/cliente/{id}")
	public String deletar(@PathVariable int id) {
		repository.deleteById(id);
		return "Deletado com sucesso";
	}
	
	@PutMapping("/api/cliente/{id}")
	public String editar(@RequestBody Cliente model, @PathVariable int id) {
		if(model.getId() == id && repository.existsById(id)) {
			repository.save(model);
			return "Alterado com sucesso";
		}
		return "Erro ID";
	}
	
}
