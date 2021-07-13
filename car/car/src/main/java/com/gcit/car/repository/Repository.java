package com.gcit.car.repository;

import org.springframework.data.repository.CrudRepository;

import com.gcit.car.domain.Domain;

public interface Repository extends CrudRepository<Domain,Long> {


	
}
