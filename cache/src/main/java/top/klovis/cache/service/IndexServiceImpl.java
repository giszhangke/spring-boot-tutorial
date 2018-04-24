package top.klovis.cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import top.klovis.cache.config.CacheConfig;

/**
 * @program: spring-boot-tutorial
 * @description: IndexService
 * @author: klovis
 * @create: 2018-04-24 22:00
 **/
@Service(value = "indexService")
public class IndexServiceImpl implements IndexService {
    @Autowired
    private CacheManager cacheManager;
    private static final int token = 0;

    @Override
    public int getToken() {

        return token;
    }
}
