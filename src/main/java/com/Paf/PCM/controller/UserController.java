package com.Paf.PCM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Paf.PCM.entity.User;
import com.Paf.PCM.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		model.addAttribute("users",userService.getAllUsers());
		return "users";
	}
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
	}
	
	@PostMapping("/users")
	public String saveUsers(@ModelAttribute("user") User user){
		userService.saveUser(user);
		return "redirect:/users";
	}
	
	@GetMapping("/users/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("user",userService.getUserById(id));
		return "edit_student";
}
	
	@PostMapping("/users/{id}")
	private String updateStudent(@PathVariable Long id,
			@ModelAttribute("user") User user,
			Model model
			) {
		//get user from db by id
		 User existingUser = userService.getUserById(id);
		 existingUser.setId(id);
		 existingUser.setUserName(user.getUserName());
		 existingUser.setNoOfUnits(user.getNoOfUnits());
		 existingUser.setPricePerUnit(user.getPricePerUnit());
		 
		 //save updated student object
		 
		 userService.updateUser(existingUser);
		 return "redirect:/users";
		
	}
	
	//hadle method to handle delete user 
	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		
		return "redirect:/users";
		
	}


	
	
	
	
	
	
	
	
	
	
}
