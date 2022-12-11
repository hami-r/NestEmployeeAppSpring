package com.nest.nestemployeeapp_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String homePage(){
        return "Welcome to the api";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/addEmp", consumes = "application/json", produces = "application/json")
    public String addEmp(){
        return "add";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/empLogin", consumes = "application/json", produces = "application/json")
    public String empLogin(){
        return "login";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/viewProfile", consumes = "application/json", produces = "application/json")
    public String viewProfile(){
        return "view profile";
    }
}
