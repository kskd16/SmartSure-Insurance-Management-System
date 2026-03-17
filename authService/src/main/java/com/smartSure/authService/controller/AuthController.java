package com.smartSure.authService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartSure.authService.dto.AuthResponseDto;
import com.smartSure.authService.dto.LoginRequestDto;
import com.smartSure.authService.dto.RegisterRequestDto;
import com.smartSure.authService.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody RegisterRequestDto request){
		return ResponseEntity.ok(authService.register(request));
	}
	
	@PostMapping("/login")public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto request){
		return ResponseEntity.ok(authService.login(request));
	}
}