
package com.makers.makersbnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// tell Spring Boot this class is a controller
@RestController
public class StaffController {
    // tell Spring Boot this method handles the 'GET "/"' request

    @GetMapping("/team")
    public ModelAndView team() {
        return new ModelAndView("team");
    }

}
