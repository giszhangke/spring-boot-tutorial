package top.klovis.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.klovis.log.service.IndexService;

/**
 * @program: spring-boot-tutorial
 * @description: IndexController
 * @author: klovis
 * @create: 2018-04-14 02:04
 **/
@Slf4j
@RestController
public class IndexController {
    @Autowired
    @Qualifier("indexService2")
    IndexService indexService;
    @RequestMapping("/")
    public String index () {
        // 根据logback-spring.xml中的配置，只会在日志文件中记录ERROR级别以上的日志
        log.info("controller info");
        log.error("controller error");
        return indexService.index();
    }
}
