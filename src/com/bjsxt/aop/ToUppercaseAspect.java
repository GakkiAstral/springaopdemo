package com.bjsxt.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ToUppercaseAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //将参数username转换大写
        Object[] args = methodInvocation.getArguments();
        args[0] = ((String)args[0]).toUpperCase();
        Object obj = methodInvocation.proceed();
        return obj;
    }
}
