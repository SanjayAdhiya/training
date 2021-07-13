package com.gcit.car.servieces;

import java.util.List;

import com.gcit.car.domain.Domain;

public interface Servieces {
	public Domain addOrupdateCar(Domain car);
	public List<Domain> getAllCar();
	public void deleteCarById(long id);
	public void deleteAllCar();
	public Domain updateCar(Domain domain);
	public String getWithName(String name);
}
