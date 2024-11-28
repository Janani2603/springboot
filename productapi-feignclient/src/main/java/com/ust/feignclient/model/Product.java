package com.ust.feignclient.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
}
