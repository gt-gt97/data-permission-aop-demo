package com.juliajiang.aopdemo.datapermission.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/3/7 4:06 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataPermission {
    String tableAlias() default "e";
}
