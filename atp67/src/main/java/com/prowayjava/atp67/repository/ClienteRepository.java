package com.prowayjava.atp67.repository;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.prowayjava.atp67.model.Cliente;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {
	
	@Override
	default Iterable<Cliente> findAll() {
		return findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	List<Cliente> findByNome(String nome);

}
