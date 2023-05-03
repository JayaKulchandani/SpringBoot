package com.java.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.CreateUserDTO;
import com.java.model.User;
import com.java.respository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository ur;
	
	public Iterable<User> getallusers()
	{
		 return this.ur.findAll();
		
	}
	
	public User addusers(CreateUserDTO cud)
	{
		User u1 = new User();
		u1.setName(cud.getName());
		u1.setEmail(cud.getEmail());
		return this.ur.save(u1);
	}

}
