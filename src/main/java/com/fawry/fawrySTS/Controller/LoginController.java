package com.fawry.fawrySTS.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.fawry.fawrySTS.servise.userServise;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.fawry.fawrySTS.model.user;


@Controller
@CrossOrigin(allowedHeaders="*",origins = "*")
public class LoginController {
	
	@Autowired
    private userServise userService;

                                   
    @GetMapping("/login")     
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new user());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") user user ) {
    	
    	user oauthUser = userService.login(user.getEmail(), user.getPassword());
    	

    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser)) 
    	{	
  
    		return "welcom you are logged in";
    	
    		
    	} else {
    		return "wrong login";
    		
    	
    	}

}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
	  
        return "redirect:/login";
    }

}