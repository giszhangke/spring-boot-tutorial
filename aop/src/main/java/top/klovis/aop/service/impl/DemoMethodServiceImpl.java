package top.klovis.aop.service.impl;

import org.springframework.stereotype.Service;
import top.klovis.aop.service.DemoService;

/**
 * Created by klovis on 2018/4/1.
 */
@Service(value = "demoMethodService")
public class DemoMethodServiceImpl implements DemoService {
    @Override
    public void add() {
        System.out.println("[service method] add");
    }
}
