package com.cts.oauthexample.sboauthdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value="/api/private/admin/helloAdmin",produces="application/json")
    public String helloAdmin(){
        return "{ 'message':'Hello Admin'}";
    }
    
}
