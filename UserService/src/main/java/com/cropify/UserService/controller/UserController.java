package com.cropify.UserService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.UserService.dto.UserCartDTO;
import com.cropify.UserService.dto.UserProfileDTO;
import com.cropify.UserService.request.UpdateUserRequest;
import com.cropify.UserService.request.UserRequest;
import com.cropify.UserService.response.OrderResponse;
import com.cropify.UserService.response.UserResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@PostMapping("/register")
	@Operation(summary = "Register New User", description = "Registers a new user with provided details.")
	@ApiResponses({
	    @ApiResponse(responseCode = "201", description = "User registered successfully"),
	    @ApiResponse(responseCode = "400", description = "Invalid user input")
	})
	public ResponseEntity<UserResponse> registerUser(@RequestBody UserRequest request) {
	    return null;
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/{userId}")
	@Operation(summary = "Get User Profile", description = "Fetches profile data of a specific user.")
	@ApiResponses({
	    @ApiResponse(responseCode = "200", description = "User profile fetched"),
	    @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<UserProfileDTO> getUserProfile(@PathVariable Long userId) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@PutMapping("/{userId}")
	@Operation(summary = "Update User Profile", description = "Updates user profile info.")
	@ApiResponses({
	    @ApiResponse(responseCode = "200", description = "User profile updated"),
	    @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<UserProfileDTO> updateUser(@PathVariable Long userId, @RequestBody UpdateUserRequest updateUserRequest) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@DeleteMapping("/{userId}")
	@Operation(summary = "Delete User", description = "Deletes user by ID.")
	@ApiResponses({
	    @ApiResponse(responseCode = "200", description = "User deleted successfully"),
	    @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/{userId}/orders")
	@Operation(summary = "Get Order History", description = "Fetches order history by calling Order Service.")
	@ApiResponses({
	    @ApiResponse(responseCode = "200", description = "Order history fetched successfully"),
	    @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<List<OrderResponse>> getOrderHistory(@PathVariable Long userId) {
	    return null;
	}

	
	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@GetMapping("/{userId}/cart")
	@Operation(summary = "Get User Cart", description = "Fetches Cart by calling Cart Service.")
	@ApiResponses({
	    @ApiResponse(responseCode = "200", description = "Cart fetched successfully"),
	    @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<UserCartDTO> getUserCart(@PathVariable Long userId) {
	    return null;
	}

	
}
