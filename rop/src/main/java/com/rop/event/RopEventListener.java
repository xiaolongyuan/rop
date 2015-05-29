package com.rop.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;

/**
 * <pre>
 *    监听所有Rop框架的事件
 * </pre>
 *
 * @author 筱龙缘
 * @version 1.0
 */
public class RopEventListener<E extends RopEvent> implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == E;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return false;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }

    @Override
    public int getOrder() {
        return 0;
    }


//    @Override
//    public boolean supportsEventType(final Class<? extends ApplicationEvent> eventType) {
//        return eventType == ContentEvent.class;
//    }
//    @Override
//    public boolean supportsSourceType(final Class<?> sourceType) {
//        return sourceType == String.class;
//    }
//    @Override
//    public void onApplicationEvent(final ApplicationEvent event) {
//        System.out.println("王五在孙六之前收到新的内容：" + event.getSource());
//    }
//    @Override
//    public int getOrder() {
//        return 1;
//    }
}

