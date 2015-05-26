/**
 * 版权声明： 版权所有 违者必究 2012
 * 日    期：12-7-30
 */
package com.rop.security;

import com.rop.RopRequestContext;
import com.rop.session.Session;

/**
 * <pre>
 *    默认的实现
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 * @since  1.1 修改默认实现 筱龙缘 2015.05.26
 */
public class DefaultInvokeTimesController implements InvokeTimesController {


    public void caculateInvokeTimes(RopRequestContext requestContext,Boolean isInvoke) {
    }


    public boolean isUserInvokeLimitExceed(String appKey, Session session) {
        return false;
    }


    public boolean isSessionInvokeLimitExceed(String appKey, String sessionId) {
        return false;
    }


    public boolean isAppInvokeLimitExceed(String appKey) {
        return false;
    }


    public boolean isAppInvokeFrequencyExceed(String appKey) {
        return false;
    }
}

