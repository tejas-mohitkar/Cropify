package com.cropify.adminservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cropify.adminservice.dto.AdminDTO;
import com.cropify.adminservice.globalexception.ResourceNotFoundException;
import com.cropify.adminservice.model.Admin;
import com.cropify.adminservice.repository.AdminRepository;
import com.cropify.adminservice.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Autowired
	ModelMapper modelMapper;

	private StringBuilder errorMessage = new StringBuilder("Admin Not found for ID = ");

	// ------------------------------- Add Admin ------------------------------------------
	
	@Override
	public AdminDTO addAdmin(AdminDTO adminDto) {
		Admin admin=this.modelMapper.map(adminDto, Admin.class);
		Admin addedAdmin = adminRepository.save(admin);
		AdminDTO adminDTO=this.modelMapper.map(addedAdmin, AdminDTO.class);
		return adminDTO;
	}
	
	// --------------------------------- Delete Admin ------------------------------------------

	@Override
	public void deleteAdmin(Long adminId) {
		Admin admin=this.adminRepository.findById(adminId).orElseThrow(()-> new ResourceNotFoundException(errorMessage.append(adminId).toString()));
		adminRepository.delete(admin);
	}

	// --------------------------------- Get Admin ------------------------------------------

	@Override
	public AdminDTO getAdmin(Long adminId) {
		Admin admin= this.adminRepository.findById(adminId).orElseThrow(()-> new ResourceNotFoundException("Admin Not Found"));
		
		return this.modelMapper.map(admin, AdminDTO.class);
	}
	
	// --------------------------------- Get All Admin ------------------------------------------

	
	//.stream() :-> This converts the admins List into a stream, allowing for functional-style operations on the elements.
	
	//.map(admin1 : this.modelMapper.map(admin1, AdminDTO.class)):
	//This is a stream operation that applies the provided function to each element in the stream. 
	//For each Admin object (admin1) in the stream, it uses the modelMapper to map it to an AdminDTO object.
	
	//.collect(Collectors.toList()) :-> 
	//This collects the results of the stream operations into a List.
	//In this case, it collects the mapped AdminDTO objects into a new List, and the result is stored in the adminsDTO variable.
	@Override
	public List<AdminDTO> getAllAdmins() {
		List<Admin> admins= this.adminRepository.findAll();
		List<AdminDTO> adminsDTO=admins.stream().map((admin1)-> this.modelMapper.map(admin1, AdminDTO.class)).collect(Collectors.toList());
		
		return adminsDTO;
	}
	
	// --------------------------------- Update Admin ------------------------------------------

// 	@Override
// 	public AdminDTO updateAdmin(AdminDTO adminDto, Long adminId) {
// 		Admin admin= this.adminRepository.findById(adminId).orElseThrow(()-> new ResourceNotFoundException("Admin Not Found"));
// 		Admin savedadmin= this.adminRepository.save(admin);

// 		return this.modelMapper.map(savedadmin, AdminDTO.class);
// 	}
	
	// ------------------------------- Count OF Seller , Customers , Farmer --------------------------------------

	@Override
	public int countOfSellers() {
		int count = adminRepository.countOfSellers("SELLER");
		return count;
	}

	@Override
	public int countOfCustomers() {
		int count = adminRepository.countOfCustomers("CUSTOMER");
		return count;
	}

	@Override
	public int countOfFarmers() {
		int count = adminRepository.countOfFarmers("FARMER");
		return count;
	}
	
	// ---------------------------- Count Of Farmer Products , agri products , machines -----------------------------

	@Override
	public int farmProductCount() {
		int count = adminRepository.farmProductCount();
		return count;
	}

	@Override
	public int agriProductCount() {
		int count = adminRepository.agriProductCount();
		return count;
	}

	@Override
	public int machineCount() {
		int count = adminRepository.machineCount();
		return count;
	}

}
