package com.example.postgresdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("/helloworld")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/fibonacci/{n}")
    public long fibonacci(@PathVariable(value = "n") long n) {
        if (n < 2) {
            return(n);
        }
        return (fib(n-2) + fib(n-1));
    }

    private static long fib(long n) {
        if (n < 2) {
            return(n);
        }
        return (fib(n-2) + fib(n-1));
    }
}
