package com.gcit.car.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "CarList")
public class Domain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	@Column(name = "CarModel")
	public String CarModel;
	
	@Column(name = "Description")
	public String Description;
		
	@Basic(optional = false)
	@CreationTimestamp
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	
	
	
	
	
	public Date getDate() {
		System.out.println(date);
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @param id
	 * @param carModel
	 * @param description
	 */
	public Domain() {
		
	}
	
	public Domain(long id, String carModel, String description) {
		this.id = id;
		this.CarModel = carModel;
		this.Description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
