package com.gcit.pet.petshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gcit.pet.petshop.domain.PetShopModel;


public interface PetShopRepository extends CrudRepository<PetShopModel, Long>{
    List<PetShopModel> findByOwnerName(String ownerName);
    
}
