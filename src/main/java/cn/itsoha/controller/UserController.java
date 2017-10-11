package cn.itsoha.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itsoha.domain.User;
import cn.itsoha.service.IUserService;

@Controller  
public class UserController {

	@Resource  
    private IUserService userService;  
      
	@RequestMapping("/user")
	public String toIndex(HttpServletRequest request,Model model){  
        User user = this.userService.getUserById(1);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  

}
