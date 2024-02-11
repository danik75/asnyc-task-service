package com.async.task.service.healthcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "healthcheck")
public class HealthcheckController {

    @Autowired
    public HealthcheckController(HealthcheckService healthcheckService) {
    this.healthcheckService = healthcheckService;
    }

    private final HealthcheckService healthcheckService;
    @GetMapping
    public String healthcheck(){
        return healthcheckService.getOK();
    }

}
