package com.example.controller.web;

import com.example.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Web")

public class WebController {
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("web/home");
        UserDTO user=new UserDTO();
        user.setName("WOULD YOU LIKE SPRING MVC?");
        mav.addObject("user",user);
        return mav;
    }
}
