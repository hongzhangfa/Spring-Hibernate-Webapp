package com.hzf.Entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_hongzhangfa")
public class Phone {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //
	@Column(name = "modelNumber")
	private String modelNumber;
	@Column(name = "brand")
	private String brand;
	@Column(name = "opSys")
	private String opSys;
	@Column(name = "features")
	private String features;

	public Phone() {
	}

	public Phone(String modelNumber, String brand, String opSys, String features) {
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.opSys = opSys;
		this.features = features;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOpSys() {
		return opSys;
	}

	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", modelNumber=" + modelNumber + ", brand=" + brand + ", opSys=" + opSys
				+ ", features=" + features + "]";
	}

}
