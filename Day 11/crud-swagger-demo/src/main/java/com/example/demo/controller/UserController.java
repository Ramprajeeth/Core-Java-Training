package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	private List<User> userList = new ArrayList<>();

	@GetMapping("/list")
	public List<User> getAllUsers() {
		return userList;
	}

	@GetMapping("/list/{id}")
	public User getUserById(@PathVariable int id) {
		for (User u : userList) {
			if (u.getId() == id) {
				return u;
			}
		}

		return null;
	}

	@PostMapping("/add")
	public String createUser(@RequestBody User user) {
		userList.add(user);
		return "Added User Successfully!";
	}

	@PutMapping("/edit/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		for (User u : userList) {
			if (u.getId() == id) {
				u.setName(user.getName());
				userList.add(u);
				return "User Updated Successfully!";
			}
		}

		return "User Not Found!";
	}

}
