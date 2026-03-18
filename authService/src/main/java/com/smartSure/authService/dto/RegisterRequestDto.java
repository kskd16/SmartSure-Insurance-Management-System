package com.smartSure.authService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequestDto {
	
	@NotBlank(message="Username should not be blank")
	private String name;
	
	@Email
	private String email;
	
	@NotBlank(message="password should not be blank")
	private String password;
	
	@NotBlank(message="role should not be blank")
	private String role;
}
