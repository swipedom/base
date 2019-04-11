package com.swipedom.base.base.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class BaseController {
    @GetMapping("/")
    @ApiOperation(value = "Retrieve Users Details")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = String.class)})
    public HashMap<String, String> apiHome() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Base-Api-v1", "success");
        return map;
    }
}
