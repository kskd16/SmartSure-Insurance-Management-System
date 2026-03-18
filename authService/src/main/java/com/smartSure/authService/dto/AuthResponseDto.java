package com.smartSure.authService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponseDto {
	
	private String token;
	private String name;
	private String role;
}
