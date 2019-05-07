package com.example.demo.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Bot2")
public class Bot2{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long bid;
	@NotBlank
private String bname;
	@NotBlank
private String bprice;
	
private Date createdAt;
	public Long getBid() {
		return bid;
	}
	public void setBid(Long bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = new Date();
	}




}
