package com.bridgelabz.RestApiCallsOperations.controller;

import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello From Bridgelabz..";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " From Bridgelabz";
    }

    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloPara(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }
}