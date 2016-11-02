package com.ironyard.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Raul on 11/1/16.
 */
@Controller
public class  WideopenController {

    @RequestMapping(value = "/mvc/wideopen", method = RequestMethod.GET)
    public String NoSecurity(){
        return "wideopen";
    }
}
