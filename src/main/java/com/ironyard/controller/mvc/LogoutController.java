package com.ironyard.controller.mvc;

import com.ironyard.repo.IronUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Raul on 11/1/16.
 */
@Controller
public class LogoutController {


    @RequestMapping(value = "/mvc/logout", method = RequestMethod.GET)
    public String Logout(HttpServletRequest request){

        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        return "login";
    }
}
