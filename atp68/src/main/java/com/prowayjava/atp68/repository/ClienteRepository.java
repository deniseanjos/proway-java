package com.prowayjava.atp68.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.prowayjava.atp68.model.Cliente;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {
	
	@Override
	default Iterable<Cliente> findAll() {
		return findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	List<Cliente> findByNome(String nome);

}
