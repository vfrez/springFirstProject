package com.example.springStartProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String hello(){
        return "Eae men";
    }
    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    public String TestGet(){
        return "Deu bom mermão";
    }
}