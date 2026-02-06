package com.sky.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//自定义切面类
@Aspect
@Component
@Slf4j
public class AutoFillAspect {

    //切入点
    @Pointcut("execution(*com.sky.mapper.*.*(..))")
    public void autoFillPointCut(){

    }

}
