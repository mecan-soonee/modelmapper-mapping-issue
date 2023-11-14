package com.modelmapper.issue.dto;

import lombok.Data;

@Data
public class ViewSelectedProductResponseDTO {

	private Long id;
	private String sku;
	private ViewSelectedBundleXSelectionProductDetailResponseDTO bundleXSelectionProductDetail;
}
