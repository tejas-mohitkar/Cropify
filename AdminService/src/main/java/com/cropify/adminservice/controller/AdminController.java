package com.cropify.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.adminservice.dto.AdminDTO;
import com.cropify.adminservice.globalexception.ResourceNotFoundException;
import com.cropify.adminservice.service.AdminService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin")

@Tag(
		name = "Admin Controller",
		description = "CRUD API for Admins in organization to know the growth of organization"
	)
public class AdminController {

	@Autowired
	private AdminService adminService;

	
	@Operation(
				summary = "This API creates new admin",
				description = "For new admin creation"
			)
	@ApiResponses({
				@ApiResponse(
							responseCode = "201",
							description = "HTTP Status Created"
				),
				@ApiResponse(
						responseCode = "403",
						description = "HTTP Status access denied",
						content = @Content(
							schema = @Schema(implementation = ResourceNotFoundException.class)
						)
				)
	})
	@PostMapping("/add")
	public ResponseEntity<AdminDTO> createAdmin(@RequestBody @Valid AdminDTO adminDto) {
		AdminDTO createdAdminDTO = this.adminService.addAdmin(adminDto);
		return new ResponseEntity<>(createdAdminDTO, HttpStatus.CREATED);

	}

	// DELETE
	@DeleteMapping("/delete/{adminId}")
	public ResponseEntity<?> deleteAdmin(@PathVariable Long adminId) {
		this.adminService.deleteAdmin(adminId);
		return ResponseEntity.ok("deleted");
	}

	// GET
	@GetMapping("/get/{adminId}")
	public ResponseEntity<?> getAdminById(@PathVariable Long adminId) {
		return ResponseEntity.status(HttpStatus.OK).body(this.adminService.getAdmin(adminId));
	}

	// GET ALL
	@GetMapping("/getAll")
	public ResponseEntity<List<AdminDTO>> getAllAdmins() {
		return ResponseEntity.ok(this.adminService.getAllAdmins());
	}

}
