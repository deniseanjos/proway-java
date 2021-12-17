package com.prowayjava.atp68.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowayjava.atp68.model.TipoCliente;
import com.prowayjava.atp68.repository.TipoClienteRepository;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteApi {
	
	@Autowired
	private TipoClienteRepository repository;

	@GetMapping
	public List<TipoCliente> list(){
		List<TipoCliente> list = (List<TipoCliente>)repository.findAll();
		return list;
	}
	
	@PostMapping
	public String create(@RequestBody TipoCliente model) {
		repository.save(model);
		return "Salvo com sucesso";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		repository.deleteById(id);
		return "Deletado com sucesso";
	}
	
	@PutMapping("/{id}")
	public String editar(@RequestBody TipoCliente model, @PathVariable int id) {
		if(model.getId() == id && repository.existsById(id)) {
			repository.save(model);
			return "Alterado com sucesso";
		}
		return "Erro ID";
	}
	
	
}
