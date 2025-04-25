package com.cropify.adminservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropify.adminservice.constant.ApiConstant;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(ApiConstant.ADMIN_API + ApiConstant.DASHBOARD_API)
@Tag(
		name = "User Management Controller",
		description = "CRUD API for Admins in organization to know the growth of organization"
	)
public class DashboardReportController {

	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@Operation(
		    summary = "Get summary counts for dashboard",
		    description = "Provides total number of users, products, and payments for admin dashboard"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Summary retrieved successfully"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/summary")
		public ResponseEntity<Map<String, Long>> getSummaryCounts() {
		    return null; // Implement service
		}

	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@Operation(
		    summary = "Get monthly payment trends",
		    description = "Provides payment trends grouped by month for visualization on dashboard"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Trends retrieved successfully"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/payments/monthly")
		public ResponseEntity<Map<String, Double>> getMonthlyPaymentTrends() {
		    return null;
		}

	
	//-------------------------------------------------------------------------------------------------------------------

	
	@Operation(
		    summary = "Get today's active users",
		    description = "Returns the number of unique users active today"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Data retrieved successfully"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/users/active/today")
		public ResponseEntity<Long> getTodaysActiveUsers() {
		    return null;
		}

	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@Operation(
		    summary = "Get revenue summary",
		    description = "Total revenue generated till date and revenue this month"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Revenue data retrieved successfully"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/revenue/summary")
		public ResponseEntity<Map<String, Double>> getRevenueSummary() {
		    return null;
		}

	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@Operation(
		    summary = "Get top 5 paying users",
		    description = "Returns users who have made the highest total payments"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Top users retrieved successfully"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/payments/top-users")
		public ResponseEntity<List<Map<String, Object>>> getTopPayingUsers() {
		    return null;
		}

	
	
	//-------------------------------------------------------------------------------------------------------------------
	
	
	@Operation(
		    summary = "Get revenue comparison between current and last month",
		    description = "Compares total revenue of this month with previous month"
		)
		@ApiResponses({
		    @ApiResponse(responseCode = "200", description = "Comparison data retrieved"),
		    @ApiResponse(responseCode = "403", description = "Access denied")
		})
		@GetMapping("/revenue/comparison")
		public ResponseEntity<Map<String, Double>> getRevenueComparison() {
		    return null;
		}

}
