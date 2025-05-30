package com.cropify.adminservice.service;

import java.util.List;

import com.cropify.adminservice.dto.AdminDTO;

public interface AdminService {

	// add
	public AdminDTO addAdmin(AdminDTO adminDto);

	// delete
	public void deleteAdmin(Long adminId);

	// get
	public AdminDTO getAdmin(Long adminId);

	// getAll
	public List<AdminDTO> getAllAdmins();

	// update
//	public AdminDTO updateAdmin(AdminDTO adminDto, Long adminId);
	
	// Seller Count
	public int countOfSellers();
	
	// Customer Count
	public int countOfCustomers();
		
	// Farmer Count
	public int countOfFarmers();
	
	public int farmProductCount();
	public int agriProductCount();
	public int machineCount();

}
