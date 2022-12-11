package com.nest.nestemployeeapp_backend.controller;

import com.nest.nestemployeeapp_backend.dao.EmployeeDao;
import com.nest.nestemployeeapp_backend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/")
    public String homePage(){
        return "Welcome to the api";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/addEmp", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addEmp(@RequestBody EmployeeModel employee){
        employeeDao.save(employee);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin("*")
    @PostMapping(path = "/empLogin", consumes = "application/json", produces = "application/json")
    public List<EmployeeModel> empLogin(@RequestBody EmployeeModel emp){
        return (List<EmployeeModel>) employeeDao.empLogin(emp.getUsername(),emp.getPassword());
    }

    @CrossOrigin("*")
    @PostMapping(path = "/viewProfile", consumes = "application/json", produces = "application/json")
    public List<EmployeeModel> viewProfile(@RequestBody EmployeeModel emp){
        return (List<EmployeeModel>) employeeDao.viewProfile(String.valueOf(emp.getId()));
    }
}
