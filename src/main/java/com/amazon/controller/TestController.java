package com.amazon.controller;

import com.amazon.domain.Test;
import com.amazon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping
    public List<Test> findAllTest() {
        return testService.getAllTest();
    }

}
