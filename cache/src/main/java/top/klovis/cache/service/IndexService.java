package top.klovis.cache.service;

import org.springframework.cache.annotation.Cacheable;

public interface IndexService {
    int getToken();
    int getTicket();
}
