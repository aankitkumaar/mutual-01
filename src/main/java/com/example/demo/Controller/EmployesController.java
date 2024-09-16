package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployesController {

    @GetMapping("/id")
    public String GetDataEmp()
    {
        return "Data fetch from DB";
    }

}
