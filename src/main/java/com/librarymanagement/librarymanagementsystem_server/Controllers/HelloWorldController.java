package com.librarymanagement.librarymanagementsystem_server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    
    @GetMapping(value="/")
    @ResponseBody
    public String helloWorld(){
        return "MAnikanta Hi";
    }
}
