package com.pl1111w.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: curl -X POST "http://localhost:3355/actuator/refresh"
 *               curl -X POST "http://localhost:3344/actuator/bus-refresh/cloud-config-client:3355"
 *               curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * @author: Kris
 * @date 2021/1/26 22:49
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
