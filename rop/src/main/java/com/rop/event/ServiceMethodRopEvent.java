/**
 * 版权声明： 版权所有 违者必究 2012
 * 日    期：12-6-1
 */
package com.rop.event;

import com.rop.RopContext;

/**
 * <pre>
 *   新增服务方法事件
 * </pre>
 *
 * @author 筱龙缘
 * @version 1.0
 */
public class ServiceMethodRopEvent extends RopEvent {

    public ServiceMethodRopEvent(Object source, RopContext ropContext) {
        super(source, ropContext);
    }

}

