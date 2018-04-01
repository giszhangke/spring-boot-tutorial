package top.klovis.aop.service.impl;

import org.springframework.stereotype.Service;
import top.klovis.aop.annotation.Action;
import top.klovis.aop.service.DemoService;

/**
 * Created by klovis on 2018/4/1.
 */
@Service(value = "demoAnnotationService")
public class DemoAnnotationServiceImpl implements DemoService {
    @Action(name = "注解式拦截的add操作")
    @Override
    public void add() {
        System.out.println("[service annotation] add");
    }
}
