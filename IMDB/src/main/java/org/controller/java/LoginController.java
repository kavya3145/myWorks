package org.controller.java;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kaav.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kaav.pojo.Login;
import com.kaav.pojo.UserAccount;

@Controller
public class LoginController {
  @Autowired
  UserService userService;
  
  @RequestMapping(value = "/Login", method = RequestMethod.GET)
  public ModelAndView showLogin() {
    ModelAndView mav = new ModelAndView("HomePage");
    mav.addObject("login", new Login());
    return mav;
  }
  
 
}


