package com.jinghuc.flowable.holiday;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @Author: tonganyuan
 * @Date: 2023/3/2 11:35
 * @Description:
 */
public class CallExternalSystemDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("Calling the external system for employee "
                + delegateExecution.getVariable("employee"));
    }
}
