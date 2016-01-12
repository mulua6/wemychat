package com.mio.crm.interceptor;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by liuhe on 16/1/12.
 * update
 */
@Aspect
public class MessageInterceptor {




    @Pointcut("execution(* on*(..))||execution(* login*(..))")
    private void messageAop(){

    }

    @Before("messageAop()")
    public void messageInterceptor_before() {
        //save message
        System.out.println("Before LOG : message add  ");
    }

}
