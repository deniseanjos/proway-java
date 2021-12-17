package com.prowayjava.atp68.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.prowayjava.atp68.model.TipoCliente;

public interface TipoClienteRepository extends PagingAndSortingRepository<TipoCliente, Integer> {
	
	@Override
	default Iterable<TipoCliente> findAll() {
		return findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
	
	
}
