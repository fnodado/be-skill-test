package com.crescendo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Business")
public class Business {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;

	@Column(name = "businessName")
	private String businessName;

	@Column(name = "address")
	private String address;

	@OneToMany(mappedBy = "business", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Review> reviewList;
	
	@Column(name="phone")
	private String phone;

	public Business() {
		super();
	}

	public Business(Integer id, String businessName, String address) {
		super();
		this.id = id;
		this.businessName = businessName;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
