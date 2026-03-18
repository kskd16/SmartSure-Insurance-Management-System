package com.smartSure.authService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequestDto {
	
	@NotBlank(message="Name should not be blank")
	private String name;
	
	@Email
	@NotBlank(message="Name should not be blank")
	private String email;
	
	@NotBlank(message="Name should not be blank")
	@Size(min=8, message="Minimum length of password is 8")
	private String password;
}
