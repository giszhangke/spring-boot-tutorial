package top.klovis.mybatis.config;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: spring-boot-tutorial
 * @description:
 * @author: klovis
 * @create: 2019-05-20 18:48
 **/
@EnableTransactionManagement
@Configuration
@MapperScan(value = "top.klovis.mybatis.dao")
public class MybatisPlusConfig {

    /**
     * SQL执行效率插件
     * @return
     */
    @Bean
//    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
