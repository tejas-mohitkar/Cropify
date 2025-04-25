package com.cropify.adminservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.adminservice.constant.ApiConstant;
import com.cropify.adminservice.dto.UserDto;
import com.cropify.adminservice.globalexception.ResourceNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(ApiConstant.ADMIN_API + ApiConstant.USER_API)
@Tag(
    name = "User Management Controller",
    description = "APIs for Admin to manage users like view all users, update roles, block, delete users, etc."
)
public class UserManagementController {

	
	//-------------------------------------------------------------------------------------------------------------------
	
	
    // Fetch all users
    @Operation(
        summary = "Fetch all users",
        description = "This API returns a list of all users"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Successfully fetched users"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Update user role
    @Operation(
        summary = "Update user role",
        description = "This API updates the role of a specific user"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Role updated successfully"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @PutMapping("/users/{id}/role")
    public ResponseEntity<String> updateUserRole(@PathVariable Long id, @RequestBody UserDto roleUpdate) {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Delete a user
    @Operation(
        summary = "Delete a user",
        description = "This API deletes a user by their ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "User deleted successfully"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Block user
    @Operation(
        summary = "Block user",
        description = "This API blocks a user of a specific role"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "User Blocked successfully"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @PutMapping("/users/{id}/block")
    public ResponseEntity<String> blockUser(@PathVariable Long id) {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Get user by ID
    @Operation(
        summary = "Fetch a specific user by ID",
        description = "This API returns a specific user based on their ID"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Successfully fetched the user"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Activate/Deactivate a user
    @Operation(
        summary = "Activate/Deactivate a user",
        description = "This API activates or deactivates a user based on the status"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "User status updated successfully"),
        @ApiResponse(responseCode = "404", description = "User not found"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @PutMapping("/users/{id}/status")
    public ResponseEntity<String> updateUserStatus(@PathVariable Long id, @RequestParam boolean active) {
        return null; // implement service logic
    }

    
    
  //-------------------------------------------------------------------------------------------------------------------
    
    
    // Search users by role or status
    @Operation(
        summary = "Search users by role or status",
        description = "This API returns a list of users filtered by role or status"
    )
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Successfully fetched users"),
        @ApiResponse(
            responseCode = "403", 
            description = "Access denied", 
            content = @Content(schema = @Schema(implementation = ResourceNotFoundException.class))
        )
    })
    @GetMapping("/users/search")
    public ResponseEntity<List<UserDto>> searchUsers(
            @RequestParam(required = false) String role, 
            @RequestParam(required = false) String status) {
        return null; // implement service logic
    }
}
