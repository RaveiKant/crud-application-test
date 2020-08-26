/**
 * 
 */
package com.user.service;

import com.user.dto.UserLoginRequest;
import com.user.dto.UserLoginResponse;
import com.user.dto.UserSignupRequest;

/**
 * @author ravi
 *
 */
public interface UserService {
	
	public UserLoginResponse userLogin(UserLoginRequest userLoginRequest);
	public UserLoginResponse userSignup(UserSignupRequest userSignupRequest);
	public UserLoginResponse updateUser(UserSignupRequest userSignupRequest);
	public String deleteUser(UserLoginRequest userLoginRequest);
}
