package com.cropify.adminservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cropify.adminservice.constant.ApiConstant;
import com.cropify.adminservice.dto.ProductDto;
import com.cropify.adminservice.globalexception.ResourceNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping(ApiConstant.ADMIN_API + ApiConstant.PRODUCT_API)
@Tag(
    name = "Product Management Controller",
    description = "CRUD & filter APIs for Admins to manage products by category, owner role, etc."
)
public class ProductManagementController {

    //-------------------------------------------------------------------------------------------------------------------
	
	
    @Operation(
        summary = "Get all products",
        description = "Retrieve a list of all products in the system"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "List of products returned"),
        @ApiResponse(responseCode = "403", description = "Access denied",
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return null;
    }
    
    

    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Get product by ID",
        description = "Retrieve a single product by its ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Product found"),
        @ApiResponse(responseCode = "404", description = "Product not found",
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        return null;
    }
    
    

    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Search products by category",
        description = "Retrieve products filtered by category (VEGETABLE, FRUIT, PESTICIDE, etc.)"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Filtered products returned"),
        @ApiResponse(responseCode = "403", description = "Access denied")
    })
    @GetMapping("/products/search/by-category")
    public ResponseEntity<List<ProductDto>> getByCategory(@RequestParam String category) {
        return null;
    }
    
    
    

    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Search products by owner role",
        description = "Retrieve products added by FARMER or PESTICIDE_SELLER"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Filtered products returned"),
        @ApiResponse(responseCode = "403", description = "Access denied")
    })
    @GetMapping("/products/search/by-owner-role")
    public ResponseEntity<List<ProductDto>> getByOwnerRole(@RequestParam String ownerRole) {
        return null;
    }
    
    

    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Update product availability",
        description = "Enable or disable availability of a product by ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Product availability updated"),
        @ApiResponse(responseCode = "404", description = "Product not found",
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @PutMapping("/products/{id}/status")
    public ResponseEntity<String> updateProductAvailability(
            @PathVariable Long id,
            @RequestParam boolean available) {
        return null;
    }
    
    

    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Delete a product",
        description = "Remove a product from the system by ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Product deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Product not found",
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        return null;
    }

    
    
    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Create a new product",
        description = "Add a new product (vegetable, fruit, pesticide, fertilizer, etc.)"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Product created"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @PostMapping("/products")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto) {
        return null;
    }

    
    
    //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Bulk update product availability",
        description = "Enable or disable multiple products at once"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Bulk update successful"),
        @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    @PutMapping("/products/bulk-status")
    public ResponseEntity<Void> bulkUpdateStatus(
            @RequestParam List<Long> ids,
            @RequestParam boolean available) {
        return null;
    }
    
    
    
//-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary = "Search products by owner ID",
        description = "Retrieve products added by FARMER or PESTICIDE_SELLER"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Filtered products returned"),
        @ApiResponse(responseCode = "403", description = "Access denied")
    })
    @GetMapping("/products/search/{id}")
    public ResponseEntity<List<ProductDto>> getProductOfSpecificUserById(@PathVariable Long id) {
        return null;
    }
}
