package com.user.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.dto.UserLoginRequest;
import com.user.dto.UserLoginResponse;
import com.user.dto.UserSignupRequest;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;
	
	
	@Override
	public UserLoginResponse userLogin(UserLoginRequest userLoginRequest) {
		User user = userDao.findByEmailAndPassword(userLoginRequest.getEmail(), userLoginRequest.getPassword());
		if(user!=null) {
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			return mapper.map(user, UserLoginResponse.class);
		}
		return null;
	}

	@Override
	public UserLoginResponse userSignup(UserSignupRequest userSignupRequest) {
		if(userDao.findByEmail(userSignupRequest.getEmail())==null)
		{
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			User user = mapper.map(userSignupRequest,User.class);
			user.setType("USER");
			user.setConfirmed(false);
			return mapper.map(userDao.save(user), UserLoginResponse.class);
		}
		return null;
	}
	@Override
	public UserLoginResponse updateUser(UserSignupRequest userSignupRequest) {
		if(userDao.findByEmail(userSignupRequest.getEmail()) !=null)
		{
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			User user = mapper.map(userSignupRequest,User.class);
			user.setType("USER");
			user.setConfirmed(true);
			userDao.delete(userDao.findByEmail(userSignupRequest.getEmail()));
			return mapper.map(userDao.save(user), UserLoginResponse.class);
		}
		return null;
	}

	@Override
	public String deleteUser(UserLoginRequest userLoginRequest) {
		User user = userDao.findByEmailAndPassword(userLoginRequest.getEmail(), userLoginRequest.getPassword());
		if(user!=null)
		{
			userDao.delete(user);
			return "User account deacticated successfully";
		}
		else
			return null;
	}

}
