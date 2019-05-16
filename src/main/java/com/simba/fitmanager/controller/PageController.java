package com.simba.fitmanager.controller;

import com.simba.fitmanager.dao.User;
//import com.simba.fitmanager.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@CrossOrigin(origins = "*")
@Controller
public class PageController {

    @RequestMapping(value = "/active")
    public String active() {
        return "/active";
    }

//    @GetMapping()

    @RequestMapping(value = "/login")
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/manager")
    public String manager() {
        return "/manager";
    }

    @RequestMapping("/protected")
    public String hellWorld() {
        return "Hello World! This is a protected api";
    }

//    @RequestMapping("/loginjwt")
//    public Object login(HttpServletResponse response, @RequestBody final User user) throws IOException {
//        if(isValidPassword(user)) {
//            String jwt = JwtUtil.generateToken(user.getUserName());
//            return new HashMap<String,String>(){{
//                put("token", jwt);
//            }};
//        }else {
//            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
//        }
//    }

}
