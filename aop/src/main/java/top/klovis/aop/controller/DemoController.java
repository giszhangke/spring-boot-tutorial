package top.klovis.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.klovis.aop.service.DemoService;

/**
 * Created by klovis on 2018/4/1.
 */
@Controller
public class DemoController {

    @Autowired
    @Qualifier("demoMethodService")
    private DemoService demoMethodService;
    @Autowired
    @Qualifier("demoAnnotationService")
    private DemoService demoAnnotationService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String testMethodAspect(String name) {
        System.out.println("===========Method Aspect    ============");
        demoMethodService.add();
        System.out.println("===========Annotation Aspect============");
        demoAnnotationService.add();
        return "Hello" + name;
    }
}
