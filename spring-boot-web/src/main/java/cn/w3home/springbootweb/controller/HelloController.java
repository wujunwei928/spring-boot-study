package cn.w3home.springbootweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * 使用 @Value 注解, 读取Java代码中的环境或应用程序属性值
     */
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/app_name")
    public String name() {
        return appName;
    }
}
