package com.prowayjava.atp65.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prowayjava.atp65.model.Cliente;
import com.prowayjava.atp65.repository.ClienteRepository;

@Controller
public class ClienteController {

	private ClienteRepository repository;

	public ClienteController(ClienteRepository respository) {
		this.repository = respository;
	}

	@GetMapping("/cliente")
	public String clientes(Model req) {
		List<Cliente> lista = (List<Cliente>) repository.findAll();
		req.addAttribute("clientes", lista);
		return "clientes";
	}

	@GetMapping("/cliente/form")
	public String formulario(Model req) {
		Cliente model = new Cliente();
		req.addAttribute("cliente", model);
		return "clientes-form";
	}

	@PostMapping("/cliente/salvar")
	public String salvar(Cliente model) {
		repository.save(model);
		return "redirect:/cliente";
	}

	@GetMapping("/cliente/deletar/{id}")
	public String deletar(@PathVariable int id) {
		repository.deleteById(id);
		return "redirect:/cliente";
	}

	@GetMapping("/cliente/editar/{id}")
	public String editar(@PathVariable int id, Model req) {
		Cliente model = repository.findById(id).get();
		req.addAttribute("cliente", model);
		return "clientes-form";
	}

}
