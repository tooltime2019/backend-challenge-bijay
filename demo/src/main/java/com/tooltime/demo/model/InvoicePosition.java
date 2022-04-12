package com.tooltime.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class InvoicePosition {
	
	@Column
	private Integer id;
	@Column
	private String description;
	@Column
	private float amount;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InvoicePosition [description=" + description + ", amount=" + amount + "]";
	}

}
