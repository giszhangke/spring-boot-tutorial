package top.klovis.cache.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: spring-boot-tutorial
 * @description: CacheConfig
 * @author: klovis
 * @create: 2018-04-19 08:05
 **/
@Configuration
@EnableCaching
public class CacheConfig {
    public static final int DEFAULT_MAX_SIZE = 50000;
    public static final int DEFAULT_TTL = 10;
    public static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;

    @Bean
    @Primary
    public CacheManager caffeineCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<CaffeineCache> caches = new ArrayList<>();

        for (Cache item : Cache.values()) {
            CaffeineCache caffeineCache = new CaffeineCache(
                    item.name(),
                    Caffeine.newBuilder().recordStats()
                            .expireAfterWrite(item.getTtl(), item.getTimeUnit())
                            .maximumSize(item.getMaxSize()).build()
            );
            caches.add(caffeineCache);
        }

        cacheManager.setCaches(caches);
        return cacheManager;
    }

    public enum Cache {
        TOKEN(7200),
        TICKET(7200);
        private int maxSize = DEFAULT_MAX_SIZE;
        private int ttl = DEFAULT_TTL;
        private TimeUnit timeUnit = TIME_UNIT;

        Cache() {
        }

        Cache(int ttl) {
            this.ttl = ttl;
        }

        Cache(int ttl, int maxSize) {
            this(ttl);
            this.maxSize = maxSize;
        }

        Cache(int ttl, int maxSize, TimeUnit timeUnit) {
            this(ttl, maxSize);
            this.timeUnit = timeUnit;
        }

        public int getMaxSize() {
            return maxSize;
        }

        public int getTtl() {
            return ttl;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }
    }
}
