/**
 * 版权声明： 版权所有 违者必究 2012
 * 日    期：12-7-30
 */
package com.rop.security;

import com.rop.RopRequestContext;
import org.apache.shiro.subject.Subject;

/**
 * <pre>
 *   服务访问次数及频率的控制管理器
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public interface InvokeTimesController {

    /**
     * 计算应用、会话及用户服务调度总数
     * @param requestContext 请求上下文
     * @param isInvoke 调用是否正常
     */
    void caculateInvokeTimes(RopRequestContext requestContext,Boolean isInvoke);

    /**
     * 用户服务访问次数是否超限
     * @param subject
     * @return
     */
    boolean isUserInvokeLimitExceed(String appKey, Subject subject);

    /**
     * 某个会话的服务访问次数是否超限
     * @param sessionId
     * @return
     */
    boolean isSessionInvokeLimitExceed(String appKey, String sessionId);

    /**
     * 应用的服务访问次数是否超限
     * @param appKey
     * @return
     */
    boolean isAppInvokeLimitExceed(String appKey);

    /**
     * 应用对服务的访问频率是否超限
     * @param appKey
     * @return
     */
    boolean isAppInvokeFrequencyExceed(String appKey);
}

