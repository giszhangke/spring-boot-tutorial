package top.klovis.profile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-tutorial
 * @description: ApiConfig
 * @author: klovis
 * @create: 2018-04-20 00:18
 **/
@Component
@ConfigurationProperties(prefix = "api")
public class ApiConfig {
    private String host;
    private String url;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
