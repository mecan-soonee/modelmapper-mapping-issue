package com.modelmapper.issue.model;

import java.util.List;

import lombok.Data;

//@Entity
@Data
public class ProductBundleXSelectionDetail {

	//@ManyToOne
	//@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	private int maxQuantity;
	//@OneToMany(mappedBy = "bundleXSelectionProductDetail", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<ProductBundleXSelection> bundleXSelectionProducts;
}
