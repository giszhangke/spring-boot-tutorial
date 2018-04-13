package top.klovis.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.klovis.aop.utils.HttpUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by klovis on 2018/4/1.
 */
@Aspect
@Order(5)
@Component
public class ControllerAspect {

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * top.klovis.aop.controller.*.*(..))")
    public void webLog () {}

    @Before("webLog()")
    public void doBefore (JoinPoint joinPoint) throws Throwable {
        // request start time
        startTime.set(System.currentTimeMillis());

        // request info
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String requestURL = request.getRequestURL().toString();
        String requestMethod = request.getMethod();
        // String ip = request.getRemoteAddr();
        String ip = HttpUtils.getIpAddress(request);
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        String argsStr = Arrays.toString(joinPoint.getArgs());

        System.out.println("requestURL=" + requestURL);
        System.out.println("requestMethod=" + requestMethod);
        System.out.println("ip=" + ip);
        System.out.println("class.method=" + classMethod);
        System.out.println("args=" + argsStr);
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning (Object ret) throws Throwable {
        Long time = System.currentTimeMillis() - startTime.get();
        System.out.println("response=" + ret.toString());
        System.out.println("spentTime=" + String.valueOf(time));
    }

}
