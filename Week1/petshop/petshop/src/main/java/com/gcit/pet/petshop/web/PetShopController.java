package com.gcit.pet.petshop.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gcit.pet.petshop.domain.PetShopModel;
import com.gcit.pet.petshop.service.PetShopServicesImplemetation;

@RestController
public class PetShopController {
//	1.inside other methods
	@Autowired
	private PetShopServicesImplemetation petSHopServices;
	
//	1.add
    @RequestMapping(value = "/addorupdate", method = RequestMethod.POST)
	public PetShopModel addPet(@RequestBody PetShopModel pet) {
		return petSHopServices.addOrUpdatePet(pet);
	}
//  2.edit
    @RequestMapping(value = "")
    public Optional<PetShopModel> editPet(@PathVariable("id") Long petId){
    	return petSHopServices.getPetById(petId);
    }
//    3.delete
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deletePet(@PathVariable("id") Long pettId) {  	
        return "{\"message\" : \"Deleted Successfully\"}";
    } 
//    4.getPetslist
    @RequestMapping(value = "/getpets", method = RequestMethod.GET)
    public @ResponseBody List<PetShopModel> getpets() {
        return petSHopServices.getPetList();
    }
//    5.getPetByName
    @RequestMapping(value = "/getspetbyname/{name}", method = RequestMethod.GET)
    public @ResponseBody List<PetShopModel> getPetByName(@PathVariable("name") String ownerName) {
        return petSHopServices.findByOwnerName(ownerName);
    } 
	
	
}
