package top.klovis.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import top.klovis.aop.service.DemoService;

/**
 * Created by klovis on 2018/4/1.
 */
@RestController
public class IndexController {
    @Autowired
    @Qualifier("demoMethodService")
    private DemoService demoMethodService;

    @Autowired
    @Qualifier("demoAnnotationService")
    private DemoService demoAnnotationService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String demoMethod() {
        System.out.println("===========method aspect    ============");
        demoMethodService.add();
        System.out.println("===========annotation aspect============");
        demoAnnotationService.add();

        return "看我干哈？";
    }

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello (@RequestParam String name) {
        return "Hello, " + name;
    }

}
