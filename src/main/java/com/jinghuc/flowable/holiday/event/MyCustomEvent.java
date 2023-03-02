package com.jinghuc.flowable.holiday.event;

import org.flowable.engine.common.api.delegate.event.FlowableEngineEventType;
import org.flowable.engine.common.api.delegate.event.FlowableEvent;
import org.flowable.engine.common.api.delegate.event.FlowableEventType;

/**
 * @Author: tonganyuan
 * @Date: 2023/3/2 14:15
 * @Description:
 */
public class MyCustomEvent implements FlowableEvent {

    @Override
    public FlowableEventType getType() {
        return FlowableEngineEventType.TASK_COMPLETED;
    }
}
