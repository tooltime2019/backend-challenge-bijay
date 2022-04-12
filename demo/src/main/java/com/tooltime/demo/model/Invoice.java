package com.tooltime.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.OneToMany;

@Entity
@Table
public class Invoice {

	@Id
	@Column
	private Integer id;
	@Column
	private String code;// human readable invoice code/number
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String issuedAt; // ISO date time
	@Column
	private Customer customer;

	@OneToMany(mappedBy="InvoicePosition")
	private List<InvoicePosition> positions;
	
	@Column
	private float totalAmount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(String issuedAt) {
		this.issuedAt = issuedAt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<InvoicePosition> getPositions() {
		return positions;
	}

	public void setPositions(List<InvoicePosition> positions) {
		this.positions = positions;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", code=" + code + ", title=" + title + ", description=" + description
				+ ", issuedAt=" + issuedAt + ", customer=" + customer + ", totalAmount=" + totalAmount + "]";
	}

}
