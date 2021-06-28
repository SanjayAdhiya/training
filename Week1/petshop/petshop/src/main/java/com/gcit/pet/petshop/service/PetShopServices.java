package com.gcit.pet.petshop.service;

import java.util.List;
import java.util.Optional;

import com.gcit.pet.petshop.domain.PetShopModel;

public interface PetShopServices {
	public PetShopModel addOrUpdatePet(PetShopModel student);
	public List<PetShopModel> getPetList();
	public Optional<PetShopModel> getPetById(Long studentId);
	public void deletePet(Long studentId);
	public List<PetShopModel> findByOwnerName(String lastname);
}
