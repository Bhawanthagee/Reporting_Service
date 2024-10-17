package com.assesment.reporting_service_ESAD.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reports")
public class ReportController {
    @GetMapping("/test")
    public ResponseEntity<String> testController() {
        String message = "Reporting service is up and running!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
