package com.ust.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private long Id;
	private String brand;
	private String description;
	private int qty;
	private int price;
}
