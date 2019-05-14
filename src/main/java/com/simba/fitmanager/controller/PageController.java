package com.simba.fitmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/active")
    public String active() {
        return "/active";
    }
}
