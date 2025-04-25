package com.cropify.adminservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.adminservice.constant.ApiConstant;
import com.cropify.adminservice.dto.PaymentDto;
import com.cropify.adminservice.globalexception.ResourceNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(ApiConstant.ADMIN_API + ApiConstant.PAYMENT_API)
@Tag(
    name = "Payment Management Controller",
    description = "APIs for Admins to manage payments within the organization"
)
public class PaymentManagementController {

	
	//-------------------------------------------------------------------------------------------------------------------
	
	
    @Operation(
        summary     = "Get all payments",
        description = "Retrieve a list of all payments made within the organization"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payments retrieved successfully"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @GetMapping("/payments")
    public ResponseEntity<List<PaymentDto>> getAllPayments() {
        return null; // implement service call
    }

    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    @Operation(
        summary     = "Get payment by ID",
        description = "Retrieve payment details by payment ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payment retrieved successfully"),
        @ApiResponse(responseCode = "404", description = "Payment not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @GetMapping("/payments/{id}")
    public ResponseEntity<PaymentDto> getPaymentById(@PathVariable Long id) {
        return null; // implement service call
    }
    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
 // 1. Search payments by date range
    @Operation(
        summary     = "Search payments by date range",
        description = "Retrieve a list of payments made between the specified dates (format: yyyy-MM-dd)"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payments retrieved successfully"),
        @ApiResponse(responseCode = "403", description = "Access denied", 
                     content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @GetMapping("/payments/search")
    public ResponseEntity<List<PaymentDto>> searchPayments(
            @RequestParam String fromDate,
            @RequestParam String toDate) {
        return null;
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // 2. Get payments by user ID
    @Operation(
        summary     = "Get payments by user ID",
        description = "Retrieve all payments made by a specific user"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payments retrieved successfully"),
        @ApiResponse(responseCode = "403", description = "Access denied", 
                     content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @GetMapping("/payments/user/{userId}")
    public ResponseEntity<List<PaymentDto>> getPaymentsByUser(@PathVariable Long userId) {
        return null;
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // 3. Refund a payment
    @Operation(
        summary     = "Refund a payment",
        description = "Initiate a refund for a specific payment by ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payment refunded successfully"),
        @ApiResponse(responseCode = "404", description = "Payment not found"),
        @ApiResponse(responseCode = "403", description = "Access denied", 
                     content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @PutMapping("/payments/{id}/refund")
    public ResponseEntity<String> refundPayment(@PathVariable Long id) {
        return null;
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // 4. Get payments by status
    @Operation(
        summary     = "Get payments by status",
        description = "Retrieve all payments filtered by status (e.g., SUCCESS, FAILED, PENDING)"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Payments retrieved successfully"),
        @ApiResponse(responseCode = "403", description = "Access denied", 
                     content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class)))
    })
    @GetMapping("/payments/status/{status}")
    public ResponseEntity<List<PaymentDto>> getPaymentsByStatus(@PathVariable String status) {
        return null;
    }

}
