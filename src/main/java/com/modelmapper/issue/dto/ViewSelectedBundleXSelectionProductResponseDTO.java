package com.modelmapper.issue.dto;

import lombok.Data;

@Data
public class ViewSelectedBundleXSelectionProductResponseDTO {

	private Long bundleProductId;
	private String bundleProductName;
	private String bundleProductSku;
	private String bundleProductBarcode;
}
