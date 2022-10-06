package com.crescendo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Business")
public class Business {

	@Column(name = "business_id")
	@GeneratedValue
	@Id
	private Integer business_id;

	@Column(name = "businessName")
	private String businessName;

	@Column(name = "address")
	private String address;

	@OneToMany(mappedBy = "business", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<Review> reviewList;

	public Business() {
		super();
	}

	public Business(Integer business_id, String businessName, String address) {
		super();
		this.business_id = business_id;
		this.businessName = businessName;
		this.address = address;
	}

	public Integer getBusinessId() {
		return business_id;
	}

	public void setBusinessId(Integer business_id) {
		this.business_id = business_id;
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

}
