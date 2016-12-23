package com.niit.controller;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.UserDAO;
import com.niit.DAOimpl.UserService;
import com.niit.model.User;
@Controller
public class Usercontroller {
	private UserService userService;
	@Autowired
	(required=true)
	UserDAO dao;
	// Mapping of login spring mvc login form with model class
		@RequestMapping(value = "login", method = RequestMethod.GET)
		public String submitLoginForm(@ModelAttribute("u") User u) {

			//ModelAndView model = new ModelAndView("Login");
			System.out.println("welcome to login");
			return "Login";
		}
		@RequestMapping(value = "login", method = RequestMethod.POST)
		public ModelAndView submitLoginForm(Model m) {
			System.out.println("welcome");
			ModelAndView model = new ModelAndView("Login", "u", new User());
			return model;
		}
@Qualifier
	(value="userService")
	public void setUserService(UserService us){
		this.userService = us;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String listUsers(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("listUsers", this.userService.listUser());
		return "user";
	}
	//For add and update person both
		@RequestMapping(value= "/user/add", method = RequestMethod.POST)
		public String addUser(@ModelAttribute("user") User u){
			
			if(u.getUser_id() == 0){
				//new person, add it
				this.userService.addUser(u);
			}else{
				//existing person, call update
				this.userService.updateUser(u);
			}
			
			return "redirect:/users";
			
		}
		@RequestMapping("/remove/{user_id}")
	    public String removeUser(@PathVariable("user_id") int  user_id){
			
	        this.userService.removeUser( user_id);
	        return "redirect:/users";
	    }
	 
	    @RequestMapping("/edit/{ user_id}")
	    public String editUser(@PathVariable("user_id") int user_id, Model model){
	        model.addAttribute("user", this.userService.getuserById(user_id));
	        model.addAttribute("listUsers", this.userService.listUser());
	        return "user";
	    }
		
	}

	