package com.nest.nestemployeeapp_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @CrossOrigin("*")
    @PostMapping(path = "/addTask", consumes = "application/json", produces = "application/json")
    public String addTask(){
        return "add task";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/viewAllTask", consumes = "application/json", produces = "application/json")
    public String viewAllTask(){
        return "view all task";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/viewEmpTask", consumes = "application/json", produces = "application/json")
    public String viewEmpTask(){
        return "view emp task";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/updateStatus", consumes = "application/json", produces = "application/json")
    public String updateStatus(){
        return "updateStatus";
    }
}
