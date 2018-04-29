package top.klovis.cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
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
    private static int CURRENT_C_TOKEN = 0;
    private static int CURRENT_TICKET = 100;

    /**
     *  对比：
     *  getToken()在方法内部调用了cacheManager操作缓存
     *  getTicket()则是通过注解来实现缓存
     *
     *  思考：
     *  这两种方法哪种更好？
     *
     *  通过注解来实现缓存时，方法内部可以专注于业务的处理，而不需要关注缓存相关的操作
     *
     */

    @Override
    public int getToken() {
        Cache cache = cacheManager.getCache(CacheConfig.Cache.TOKEN.name());
        int token = cache.get("c_token", () -> {
            return CURRENT_C_TOKEN++;
        });
        return token;
    }

    @Cacheable(value = "TICKET")
    public int getTicket() {
        return CURRENT_TICKET++;
    }
}
