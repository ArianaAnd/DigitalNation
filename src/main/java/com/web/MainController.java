package com.web;
import com.example.*;
import com.model.*;
import com.security.*;
import com.service.*;
import com.web.*;
import com.web.dto.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
