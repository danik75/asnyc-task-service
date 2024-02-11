package com.async.task.service.healthcheck;

import org.springframework.stereotype.Component;

@Component
public class HealthcheckService {

    public String getOK(){
        return "OK";
    }


}
