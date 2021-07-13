package com.gcit.car.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcit.car.domain.Domain;
import com.gcit.car.servieces.ServiecesImplementaion;

@RestController
public class Controller {

	@Autowired
	private ServiecesImplementaion servmple;
	
	//add one value
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Domain addAndEditCar(@RequestBody Domain name) {
		return servmple.addOrupdateCar(name);
	}
	@RequestMapping(value = "/addAll", method = RequestMethod.POST)
	public List<Domain> addListOfCar(@RequestBody List<Domain> domain) {
		return (List<Domain>) servmple.addManyCars(domain);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Domain updateSingle(@RequestBody Domain domain) {
		return servmple.updateCar(domain);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Domain> getAllCarDetials() {
		return servmple.getAllCar();
	}
	@RequestMapping(value = "/getBymodel/{name}", method = RequestMethod.GET)
	public String getAllCarDetialsBymodel(@PathVariable("name") String name) {
		return servmple.getWithName(name);
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Optional<Domain> getSingle(@PathVariable("id") long id) {
		return servmple.getByid(id);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteCar(@PathVariable("id") long id) {
		servmple.deleteCarById(id);
		return id + "car is deleted";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deletaAllCar() {
		servmple.deleteAllCar();
		return "all cars are deleted";
	}

}
