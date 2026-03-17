package com.smartSure.authService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestDto {
	
	@NotBlank(message="Name should not be blank")
	private String name;
	
	@Email
	@NotBlank(message="Email should not be blank")
	private String email;
	
	@Size(min=8, message="Minimum length of password should be 8")
	@NotBlank(message="Password is needed")
	private String password;
	
	@Min(value = 10, message="Length of the phone number is 10")
	private Long phone;
}
