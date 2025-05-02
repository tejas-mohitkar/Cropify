package com.cropify.productservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cropify.productservice.dto.ProductRequestDTO;
import com.cropify.productservice.dto.ProductResponseDTO;

import io.swagger.v3.oas.annotations.Operation;

public class ProductController {

	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@PostMapping
	@Operation(summary = "Create New Product", description = "Add a new product to the catalog.")
	public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO productRequest) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/{productId}")
	@Operation(summary = "Get Product Details", description = "Fetch product details by ID.")
	public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable Long productId) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping
	@Operation(summary = "List All Products", description = "Fetch a list of all products.")
	public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
	    return null;
	}

	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@PutMapping("/{productId}")
	@Operation(summary = "Update Product", description = "Update details of an existing product.")
	public ResponseEntity<ProductResponseDTO> updateProduct(@PathVariable Long productId, @RequestBody ProductRequestDTO productRequest) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@DeleteMapping("/{productId}")
	@Operation(summary = "Delete Product", description = "Remove a product from catalog by ID.")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/search")
	@Operation(summary = "Search Products", description = "Search products by name or category.")
	public ResponseEntity<List<ProductResponseDTO>> searchProducts(@RequestParam String keyword) {
	    return null;
	}

	
	

	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/filter")
	@Operation(summary = "Filter Products", description = "Filter products by price range, category, or rating.")
	public ResponseEntity<List<ProductResponseDTO>> filterProducts(
	        @RequestParam(required = false) String category,
	        @RequestParam(required = false) Double minPrice,
	        @RequestParam(required = false) Double maxPrice,
	        @RequestParam(required = false) Double minRating
	) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/top-selling")
	@Operation(summary = "Top Selling Products", description = "Fetch the top selling products based on order history.")
	public ResponseEntity<List<ProductResponseDTO>> getTopSellingProducts() {
	    return null;
	}


	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/discounts")
	@Operation(summary = "Discounted Products", description = "Fetch products currently on discount.")
	public ResponseEntity<List<ProductResponseDTO>> getDiscountedProducts() {
	    return null;
	}
	
	
}
