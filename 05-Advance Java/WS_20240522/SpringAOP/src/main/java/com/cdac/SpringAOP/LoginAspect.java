package com.cdac.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    private EasyBank easyBank;

    public EasyBank getEasyBank() {
        return easyBank;
    }

    @Autowired
    public void setEasyBank(EasyBank easyBank) {
        this.easyBank = easyBank;
    }

    /**
     * 
     * @param joinPoint
     * @throws Throwable
     *  //As you can see here, a name of the pointcut expression is dotask(). 
    //  It will be applied on all the methods of Operation class regardless of the return type.
     */
    @Around(value = "execution(public void com.cdac.SpringAOP.EasyBank.doWithdraw(..))")//point-cut expression
    public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new Exception();
        } else {
        	//Proceed with the next advice or target method invocation
            joinPoint.proceed();
            System.out.println("Your remaining balance is " + (easyBank.getBalance()));
        }
    }
   
    @Before("execution(public void com.cdac.SpringAOP.EasyBank.showBalance(..)) || " +
            "execution(public void com.cdac.SpringAOP.EasyBank.doDeposit(..))")
    public void validateBalance() {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new RuntimeException();
        }
    }

    @AfterReturning(value = "execution(public void com.cdac.SpringAOP.EasyBank.doChangePin(..))")
    public void afterPinChange() {
        System.out.println("You have successfully changed your pin");
    }


    @AfterThrowing(value = "within(com.cdac.SpringAOP.EasyBank)")
    public void afterWrongPin() {
        System.out.println("Invalid Pin");
    }
}