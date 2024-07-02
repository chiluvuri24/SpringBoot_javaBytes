package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect {

    private Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted,..)")
    public void startedCheck(JoinPoint joinPoint, boolean vehicleStarted){
        if(!vehicleStarted){
            logger.info(joinPoint.getSignature().toString()+" condition "+vehicleStarted);
            throw new RuntimeException("Vehicle Not Started");
        }

    }


}
