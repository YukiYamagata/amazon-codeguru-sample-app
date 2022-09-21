package com.example.codeguru.controller;

import com.example.codeguru.controller.dto.RestOutDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping
    public RestOutDto findStudents() {
        var restOutDto = new RestOutDto();
        restOutDto.setId("ID001");
        restOutDto.setName("太郎");
        return restOutDto;
    }
}
