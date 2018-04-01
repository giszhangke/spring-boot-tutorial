package top.klovis.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by klovis on 2018/4/1.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(top.klovis.aop.Action)")
    public void annotationPointCut() {

    }
}
