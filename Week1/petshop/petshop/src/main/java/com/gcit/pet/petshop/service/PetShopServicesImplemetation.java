package com.gcit.pet.petshop.service;

import org.springframework.stereotype.Service;

import com.gcit.pet.petshop.domain.PetShopModel;
import com.gcit.pet.petshop.repository.PetShopRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class PetShopServicesImplemetation implements PetShopServices{
	
	@Autowired
	private PetShopRepository petShopRepository;
	
	public PetShopModel addOrUpdatePet(PetShopModel pet) {
		return pet;
	}

	@Override
	public List<PetShopModel> getPetList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PetShopModel> getPetById(Long petId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePet(Long petId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PetShopModel> findByOwnerName(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
