package com.ust.msA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class product {
    @Id
    @GeneratedValue
	private long productId;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
}
