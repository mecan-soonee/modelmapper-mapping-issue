package com.modelmapper.issue;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modelmapper.issue.dto.ViewSelectedProductResponseDTO;
import com.modelmapper.issue.model.Product;
import com.modelmapper.issue.model.ProductBundleXSelection;
import com.modelmapper.issue.model.ProductBundleXSelectionDetail;

public class ModelMapperMapIssueApplication {

	public static void main(String[] args) {

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);

		Product product = new Product(1000L);
		
			ProductBundleXSelectionDetail detail = new ProductBundleXSelectionDetail();
			
				ProductBundleXSelection selection1 = new ProductBundleXSelection();		
					Product bundleProduct1 = new Product(1L);
					bundleProduct1.setSku("sku1");
				selection1.setBundleProduct(bundleProduct1);
				
				ProductBundleXSelection selection2 = new ProductBundleXSelection();		
					Product bundleProduct2 = new Product(2L);
					bundleProduct2.setSku("sku2");
				selection2.setBundleProduct(bundleProduct2);
			
			detail.setMaxQuantity(55);
			detail.setBundleXSelectionProducts(Arrays.asList(selection1, selection2));
		
		product.setSku("sku1000");
		product.setBundleXSelectionProductDetail(detail);
		
		ViewSelectedProductResponseDTO dto = mapper.map(product, ViewSelectedProductResponseDTO.class);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(dto));
	}

}
