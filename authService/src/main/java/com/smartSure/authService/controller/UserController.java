package com.smartSure.authService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartSure.authService.dto.AddressRequestDto;
import com.smartSure.authService.dto.AddressResponseDto;
import com.smartSure.authService.dto.UserRequestDto;
import com.smartSure.authService.dto.UserResponseDto;
import com.smartSure.authService.service.AddressService;
import com.smartSure.authService.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	
	private final UserService service;
	private final AddressService addService;
	
	@PostMapping("/addInfo")
//	@PreAuthorize("hasRole('AGENT')")
	public ResponseEntity<UserResponseDto> addInfo(@RequestBody @Valid UserRequestDto reqDto){
		
		UserResponseDto resDto = service.add(reqDto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resDto);
	}
	
	@GetMapping("/getInfo/{userId}")
	public ResponseEntity<UserResponseDto> getUser(@PathVariable Long userId){
		
		UserResponseDto resDto = service.get(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<UserResponseDto> updateUser(@RequestBody @Valid UserRequestDto reqDto, @PathVariable Long userId){
		
		UserResponseDto resDto = service.update(reqDto, userId);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resDto);
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<UserResponseDto> deleteUser(@PathVariable Long id){
		
		UserResponseDto resDto = service.delete(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
	
	@PostMapping("/addAddress/{userId}")
	public ResponseEntity<AddressResponseDto> addAddress(@RequestBody @Valid AddressRequestDto reqDto, @PathVariable Long userId){
		
		AddressResponseDto resDto = addService.create(reqDto, userId);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resDto);
	}
	
	@GetMapping("/getAddress/{userId}")
	public ResponseEntity<AddressResponseDto> getAddress(@PathVariable Long userId){
		
		AddressResponseDto resDto = addService.get(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
	
	@PutMapping("/updateAddress/{userId}")
	public ResponseEntity<AddressResponseDto> updateAddress(@RequestBody @Valid AddressRequestDto reqDto, @PathVariable Long userId){
		
		AddressResponseDto resDto = addService.update(reqDto, userId);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(resDto);
	}
	
	@DeleteMapping("/deleteAddress/{userId}")
	public ResponseEntity<AddressResponseDto> deleteAddress(@PathVariable Long userId){
		
		AddressResponseDto resDto = addService.delete(userId);
		
		return ResponseEntity.status(HttpStatus.OK).body(resDto);
	}
}
