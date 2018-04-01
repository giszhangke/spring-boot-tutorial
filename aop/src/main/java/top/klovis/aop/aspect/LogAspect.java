package top.klovis.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import top.klovis.aop.annotation.Action;

import java.lang.reflect.Method;

/**
 * Created by klovis on 2018/4/1.
 */
@Aspect
@Order(1)
@Component
public class LogAspect {

    @Pointcut("@annotation(top.klovis.aop.annotation.Action)")
    public void annotationLog() {}

    @Pointcut("execution(public * top.klovis.aop.service.*.*(..))")
    public void methodLog() {}

    @Before("methodLog()")
    public void doBefore(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("[methodAspect] " + method.getName() + " doBefore");
    }

    @After("annotationLog()")
    public void doAfter(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("[annotationAspect] " + action.name() + " doAfter ");
    }
}
