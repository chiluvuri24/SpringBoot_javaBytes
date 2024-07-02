package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        Instant start = Instant.now();
        logger.info(joinPoint.getSignature().toString()+ " Method Execution Started");
        joinPoint.proceed();
        Instant end = Instant.now();
        long millis = Duration.between(start,end).toMillis();
        logger.info(joinPoint.getSignature().toString()+" Method Execution Ended");
        logger.info(joinPoint.getSignature().toString()+" has taken "+millis+" ms");

    }


    @AfterThrowing(value = "execution(* com.example.services.*.*(..))",throwing = "ex")
    public void logExeption(JoinPoint joinPoint, Exception ex){
        logger.log(Level.SEVERE,joinPoint.getSignature()+" Exception thrown with the help of @AfterThowing and msg is"+ex.getStackTrace());
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..))", returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, joinPoint.getSignature()+" Method successfully executed with Return Value "+retVal);
    }

}
