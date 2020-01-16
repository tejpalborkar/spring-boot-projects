/**

Copyright (c) 2019 CoreView Systems (P) Ltd.

Module Name:
      Leave.java

Abstract:
	  This is an entity class for Leave.
	   It has all the fields required for storing leave details.
	 		
Revision History:
      Date:       Dec 12, 2019
      Author:     Amruta Jogdand
      Desc:       Created.

*/
package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("company")
public class Company {

	@Id
	@Column("companyid")
	private Long companyId;
	private String name;
	private String address;
	
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Company(Long companyId, String name, String address) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.address = address;
	}
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
