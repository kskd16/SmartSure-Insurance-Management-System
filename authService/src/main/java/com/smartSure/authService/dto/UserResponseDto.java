package com.smartSure.authService.dto;


import lombok.Data;

@Data
public class UserResponseDto {
	
	private Long userId;
	private String name;
	private String email;
	private String password;
	private Long phone;
	private String role;
}
