package com.modelmapper.issue.dto;

import java.util.List;

import lombok.Data;

@Data
public class ViewSelectedBundleXSelectionProductDetailResponseDTO {

	private int maxQuantity;
	private List<ViewSelectedBundleXSelectionProductResponseDTO> bundleXSelectionProducts;
}
