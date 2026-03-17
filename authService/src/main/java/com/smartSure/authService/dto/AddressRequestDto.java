package com.smartSure.authService.dto;

import lombok.Data;

@Data
public class AddressRequestDto {
	
	private String city;
	private String state;
	private Long zip;
	private String street_address;
}
