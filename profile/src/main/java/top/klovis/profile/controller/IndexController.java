package top.klovis.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.klovis.profile.config.ApiConfig;

/**
 * @program: spring-boot-tutorial
 * @description: IndexController
 * @author: klovis
 * @create: 2018-04-20 00:41
 **/
@RestController
public class IndexController {
    @Autowired
    private ApiConfig apiConfig;

    @RequestMapping("/")
    public String index() {
        return apiConfig.getUrl();
    }
}
