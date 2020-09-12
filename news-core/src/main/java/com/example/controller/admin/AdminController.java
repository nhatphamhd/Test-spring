package com.example.controller.admin;

import com.example.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @RequestMapping(value = "/admin/home",method = RequestMethod.GET)
    public  ModelAndView adminPahe(){
        ModelAndView mav=new ModelAndView("admin/home");
        UserDTO user=new UserDTO();
        user.setName("DEMO WEB SU DUG SPRING");
        mav.addObject("users",user);
        return mav;
    }
}
