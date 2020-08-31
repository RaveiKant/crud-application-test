package com.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserLoginRequest;
import com.user.dto.UserLoginResponse;
import com.user.dto.UserSignupRequest;
import com.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public ResponseEntity<UserLoginResponse> userLogin(@RequestBody UserLoginRequest userLoginRequest )
	{	
		UserLoginResponse res = userService.userLogin(userLoginRequest);
		if(res!=null)
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.FOUND);
		else
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.FORBIDDEN);
		
	}
	
	@PostMapping("/signup")
	public ResponseEntity<UserLoginResponse> userSignup(@RequestBody UserSignupRequest userSignupRequest)
	{	
		UserLoginResponse res = userService.userSignup(userSignupRequest);
		if(res!=null)
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.CREATED);
		else
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.CONFLICT);
	}
	
	@PutMapping("/update")
	public ResponseEntity<UserLoginResponse> userUpdate(@RequestBody UserSignupRequest userSignupRequest)
	{	
		UserLoginResponse res = userService.updateUser(userSignupRequest);
		if(res!=null)
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.OK);
		else
			return new ResponseEntity<UserLoginResponse>(res,HttpStatus.CONFLICT);
	}
	
	@DeleteMapping("/delete")
	 public Map<String, String> deleteUser(@RequestBody UserLoginRequest userLoginRequest) {
        Map<String, String> resultMap = new HashMap<>();
       if(userService.deleteUser(userLoginRequest)!=null)
        	resultMap.put("userDeactivation", "successful");
       else
        	resultMap.put("userDeactivation", "invalid credentials");
       return resultMap;
    }

}
