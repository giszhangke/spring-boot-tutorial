package top.klovis.aop2.service.impl;

import org.springframework.stereotype.Service;
import top.klovis.aop2.annotation.Action;
import top.klovis.aop2.service.DemoService;

/**
 * Created by klovis on 2018/4/1.
 */
@Service("demoAnnotationService")
public class DemoAnnotationServiceImpl implements DemoService {
    @Action(name = "哈哈哈，我是哪吒！")
    @Override
    public void add () {
        System.out.println("[service] DemoAnnotationService.add()");
    }
}
