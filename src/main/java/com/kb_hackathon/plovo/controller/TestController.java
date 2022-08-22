package com.kb_hackathon.plovo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"TestController API Test"})
public class TestController {

    @GetMapping("/home")
    @ApiOperation(value = "getHome테스트", notes = "설명")
    public String getHome(){
        return "Hello World!";
    }
}