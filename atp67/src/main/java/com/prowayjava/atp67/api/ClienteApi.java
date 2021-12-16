package com.prowayjava.atp67.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowayjava.atp67.model.Cliente;
import com.prowayjava.atp67.repository.ClienteRepository;

@RestController
@RequestMapping("/api/cliente")
public class ClienteApi {
	
	@Autowired //Não precisa do construtor para iniciar, injeção de dependencia
 	private ClienteRepository repository;

	
	@GetMapping
	public List<Cliente> clientes(String nome) {
		if(nome != null) {
			return (List<Cliente>)repository.findByNome(nome);
		}
		return (List<Cliente>)repository.findAll();
	}
	
	@PostMapping
	public String salvar(@RequestBody Cliente model) {
		repository.save(model);
		return "Salvo com sucesso";
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable int id) {
		repository.deleteById(id);
		return "Deletado com sucesso";
	}
	
	@PutMapping("/{id}")
	public String editar(@RequestBody Cliente model, @PathVariable int id) {
		if(model.getId() == id && repository.existsById(id)) {
			repository.save(model);
			return "Alterado com sucesso";
		}
		return "Erro ID";
	}
	
}
