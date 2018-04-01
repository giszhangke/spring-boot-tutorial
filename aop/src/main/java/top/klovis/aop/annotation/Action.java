package top.klovis.aop.annotation;

import java.lang.annotation.*;

/**
 * Created by klovis on 2018/4/1.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
