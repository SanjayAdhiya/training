package com.gcit.pet.petshop.domain;

import javax.persistence.*;

@Entity
@Table(name = "Pet_Shop")
public class PetShopModel {
	private long id;
	private String petName;
	private String ownerName;
	private String type;
	private String age;

	public PetShopModel() {
	}

	public PetShopModel(String petName, String ownerName, String type, String age) {
		super();
		this.petName = petName;
		this.ownerName = ownerName;
		this.type = type;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "petName")
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	@Column(name = "ownerName")
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "age")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}