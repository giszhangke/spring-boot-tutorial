package top.klovis.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import top.klovis.cache.service.IndexService;

/**
 * @program: spring-boot-tutorial
 * @description:
 * @author: klovis
 * @create: 2018-04-24 21:58
 **/
@RestController
public class IndexController {
    @Autowired
    @Qualifier("indexService")
    private IndexService indexService;
    public String getToken() {
        return "current token: " + indexService.getToken();
    }
}
