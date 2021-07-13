package com.gcit.car.servieces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcit.car.domain.Domain;
import com.gcit.car.repository.Repository;

@Service
public class ServiecesImplementaion implements Servieces {

	@Autowired
	private Repository repo;

	public Domain addOrupdateCar(Domain car) {
		return repo.save(car);
	}
	
	public Iterable<Domain> addManyCars(List<Domain> domains) {
		return repo.saveAll(domains);
	}
	
	public Domain updateCar(Domain domian) {
		
		Domain exsistingDomain = repo.findById(domian.getId()).orElseGet(null);
		exsistingDomain.setCarModel(domian.getCarModel());
		exsistingDomain.setDescription(domian.getDescription());
		return repo.save(exsistingDomain);
	}

	public List<Domain> getAllCar() {
		return (List<Domain>) repo.findAll();
	}

	public Optional<Domain> getByid(long number) {
		return repo.findById(number);
	}
	
	public void deleteCarById(long id) {
		repo.deleteById(id);
	}

	public void deleteAllCar() {
		repo.deleteAll();
	}

	public String getWithName(String name) {
		Domain obj = new Domain();
		String a = obj.getCarModel();
		if(a == name) {
			return obj.getId()+obj.getCarModel()+obj.getDescription();
		}
		return null;
	}
}
