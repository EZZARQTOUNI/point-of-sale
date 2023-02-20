package com.jwt.pfe.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SinglePageController  implements ErrorController {
    @GetMapping("/error")
    public String errorRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(200);
        return "index.html";
    }


//    @GetMapping(value = "{path:[^\\.]*}")
//    public String getAllPages() {
//        return "index.html";
//    }
}
