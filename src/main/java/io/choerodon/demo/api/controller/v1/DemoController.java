package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/application.yml")
public class DemoController {

    @Autowired
    Environment env;


    @GetMapping("/hello")
    public String hello(){
        String userName = env.getProperty("usr.name");
        String userId = env.getProperty("usr.id");
        return "hello, " + userId + ", " + userName;
    }

}
