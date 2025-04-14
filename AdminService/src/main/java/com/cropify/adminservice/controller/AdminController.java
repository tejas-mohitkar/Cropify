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
import com.cropify.adminservice.service.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// POST
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
	
	//---------------------- Count of Seller , Customer , Farmer ------------------------------------
	
//	@GetMapping("/sellerCount")
//	public ResponseEntity<?> GetCountSeller(){
//		return ResponseEntity.ok(this.adminService.countOfSellers());
//	}
//	
//	@GetMapping("/farmerCount")
//	public ResponseEntity<?> GetCountFarmer(){
//		return ResponseEntity.ok(this.adminService.countOfFarmers());
//	}
//	
//	@GetMapping("/customerCount")
//	public ResponseEntity<?> GetCountCustomer(){
//		return ResponseEntity.ok(this.adminService.countOfCustomers());
//	}
//	
//	// ---------------------------- Count -----------------------------
//	
//	@GetMapping("/agriProdCount")
//	public ResponseEntity<?> GetAgriProductCount(){
//		return ResponseEntity.ok(this.adminService.agriProductCount());
//	}
//	
//	@GetMapping("/farmerProdCount")
//	public ResponseEntity<?> GetFarmerProductCount(){
//		return ResponseEntity.ok(this.adminService.farmProductCount());
//	}
//	
//	@GetMapping("/machineCount")
//	public ResponseEntity<?> GetMachineCount(){
//		return ResponseEntity.ok(this.adminService.machineCount());
//	}
//	
//	// ---------------------------- Dashboard analysis -----------------------------
//	@GetMapping("/totalorders")
//	public ResponseEntity<?> totalOrders(){
//		return ResponseEntity.ok(this.adminService.machineCount());
//	}
//	
//	@GetMapping("/machineCount")
//	public ResponseEntity<?> totalOrderExpence(){
//		return ResponseEntity.ok(this.adminService.machineCount());
//	}
//	
//	// ---------------------------- Dashboard analysis -----------------------------
//	@GetMapping("/{farmerId}/allProducts")
//	public ResponseEntity<?> getFarmerWithProducts(){
//		return ResponseEntity.ok(this.adminService.machineCount());
//	}
//	
//	@GetMapping("/{serllerId}/allSeller")
//	public ResponseEntity<?> sellerWithProducts(){
//		return ResponseEntity.ok(this.adminService.machineCount());
//	}

}
