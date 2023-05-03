package com.java.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.Services.UserService;
import com.java.dto.CreateUserDTO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService us;

	@GetMapping("")
	public ResponseEntity<?> getalluser()
	{
		return new ResponseEntity<>(this.us.getallusers(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> adduser(@RequestBody CreateUserDTO cud)
	{
		return new ResponseEntity<>(this.us.addusers(cud), HttpStatus.CREATED);
	}
}
