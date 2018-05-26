package top.klovis.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @program: spring-boot-tutorial
 * @description: IndexController
 * @author: klovis
 * @create: 2018-05-13 17:24
 **/
@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "Hello World";
    }

    @RequestMapping(value = "success")
    public String success(HttpSession session) {
//        String user = (String) session.getAttribute("user");
//        LOGGER.info(user);
        return "success";
    }

    @RequestMapping(value = "/failure", method = RequestMethod.GET)
    public String failure() {
        return "failure";
    }
}
