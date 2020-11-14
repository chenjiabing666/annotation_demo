package com.example.annotation_demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Component： 注入到容器中
 * @Aspect：标志这是一个切面
 * @Order: 指定切面执行的优先级
 */
@Component
@Aspect
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SysLogAspect {

    @Pointcut("@annotation(com.example.annotation_demo.annotation.SysLog)")
    public void pointCut() {}

    /**
     * 环绕通知
     */
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //逻辑开始时间
        long beginTime = System.currentTimeMillis();

        //执行方法
        Object result = point.proceed();

        //todo，保存日志，自己完善
//        saveLog(point,beginTime);

        return result;
    }
}
