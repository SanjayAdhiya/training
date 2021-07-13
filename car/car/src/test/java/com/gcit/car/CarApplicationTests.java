package com.gcit.car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.gcit.car.controller.Controller;
import com.gcit.car.domain.Domain;
import com.gcit.car.repository.Repository;
import com.gcit.car.servieces.ServiecesImplementaion;


@SpringBootTest
class CarApplicationTests {
	
	@MockBean
	Repository rep;
	@MockBean
	ServiecesImplementaion serveimp;
	@MockBean
	Controller control;
	
	@BeforeEach
	void contextLoads() {
		
	}
	@Test 
	public void checkAddLogic() {
		Domain objd = new Domain(222222,"inova","black");
		String a = objd.getCarModel();
		assertEquals("inova", a);
	}
	@Test 
	public void updateLogic() {
		Domain objd = new Domain(222222,"inova","black");
		serveimp.addOrupdateCar(objd);
		Domain objd1 = new Domain(222000,"inova","black");
		serveimp.updateCar(objd1);
		List<Domain> s = serveimp.getAllCar();
		if(s.isEmpty() == false) {
		serveimp.deleteAllCar();
		}
		s.isEmpty();
	}
	@Test
	public void serviceTest() {
		when(serveimp.getWithName("suv")).thenReturn("works");
	}
	@Test
	public void serviceTest01() {
		Optional<Domain> objd = Optional.of(new Domain(222222,"inova","black"));
		when(serveimp.getByid(0)).thenReturn(objd);
	}
	
	@Test
	public void controllTest01() {
		List<Domain> list = new ArrayList<>();
		when(control.addListOfCar(list)).thenReturn(list);
	}
	
	
}
