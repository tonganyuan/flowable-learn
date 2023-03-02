package com.jinghuc.flowable.holiday.event;

import org.flowable.engine.common.api.delegate.event.FlowableEvent;
import org.flowable.engine.common.api.delegate.event.FlowableEventListener;

/**
 * @Author: tonganyuan
 * @Date: 2023/3/2 14:18
 * @Description:
 */
public class MyCustomEventListener implements FlowableEventListener {
    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        System.out.println("自定义的时间监听器触发了：" + flowableEvent.getClass());
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

    @Override
    public boolean isFireOnTransactionLifecycleEvent() {
        return false;
    }

    @Override
    public String getOnTransaction() {
        return null;
    }
}
