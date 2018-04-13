package top.klovis.log.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.klovis.log.service.IndexService;

/**
 * @program: spring-boot-tutorial
 * @description: IndexServiceImpl
 * @author: klovis
 * @create: 2018-04-14 02:33
 **/
@Slf4j
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Override
    public String index() {
        log.info("service info");
        log.error("service error");
        return "IndexService Success!";
    }
}
