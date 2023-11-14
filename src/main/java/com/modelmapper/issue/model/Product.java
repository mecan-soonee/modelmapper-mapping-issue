package com.modelmapper.issue.model;

import lombok.Data;

@Data
public class Product {

	private Long id;
	private String sku;
	private ProductBundleXSelectionDetail bundleXSelectionProductDetail;

	public Product(Long id) {
		this.id = id;
	}
}
