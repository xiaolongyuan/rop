/**
 *
 * 日    期：12-2-23
 */
package com.rop.security;

import java.util.EnumMap;

/**
 * <pre>
 * 功能说明：
 *
 错误编码  错误说明
 1  服务不可用
 2  开发者权限不足
 3  用户权限不足
 4  图片上传失败
 5  HTTP 方法被禁止
 6  编码错误
 7  请求被禁止
 8  服务已经作废
 9  业务逻辑出错

 20  缺少 sessionId 参数
 21  无效的 sessionId 参数
 22  缺少 appKey 参数
 23  无效的 appKey 参数
 24  缺少签名参数
 25  无效签名
 26  缺少方法名参数
 27  不存在的方法名
 28  缺少版本参数
 29  非法的版本参数
 30  不支持的版本号
 31  无效报文格式类型
 32  缺少必选参数
 33  非法的参数
 34  用户调用服务的次数超限
 35  会话调用服务的次数超限
 36  应用调用服务的次数超限
 37  应用调用服务的频率超限
 38  缺少时间戳参数
 39  非法的时间戳参数
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 * @since  1.1 添加 时间戳参数错误类型 筱龙缘
 */
public enum MainErrorType {
    SERVICE_CURRENTLY_UNAVAILABLE,
    INSUFFICIENT_ISV_PERMISSIONS,
    INSUFFICIENT_USER_PERMISSIONS,
    UPLOAD_FAIL,
    HTTP_ACTION_NOT_ALLOWED,
    INVALID_ENCODING,
    FORBIDDEN_REQUEST,
    METHOD_OBSOLETED,
    BUSINESS_LOGIC_ERROR,
    MISSING_SESSION,
    INVALID_SESSION,
    MISSING_APP_KEY,
    INVALID_APP_KEY,
    MISSING_SIGNATURE,
    INVALID_SIGNATURE,
    MISSING_METHOD,
    INVALID_METHOD,
    MISSING_VERSION,
    INVALID_VERSION,
    UNSUPPORTED_VERSION,
    INVALID_FORMAT,
    MISSING_REQUIRED_ARGUMENTS,
    INVALID_ARGUMENTS,
    EXCEED_USER_INVOKE_LIMITED,
    EXCEED_SESSION_INVOKE_LIMITED,
    EXCEED_APP_INVOKE_LIMITED,
    EXCEED_APP_INVOKE_FREQUENCY_LIMITED,
    MISSING_TIMESTAMP,
    INVALID_TIMESTAMP;

    private static EnumMap<MainErrorType, String> errorCodeMap = new EnumMap<MainErrorType, String>(MainErrorType.class);

    static {
        errorCodeMap.put(MainErrorType.SERVICE_CURRENTLY_UNAVAILABLE, "1");
        errorCodeMap.put(MainErrorType.INSUFFICIENT_ISV_PERMISSIONS, "2");
        errorCodeMap.put(MainErrorType.INSUFFICIENT_USER_PERMISSIONS, "3");
        errorCodeMap.put(MainErrorType.UPLOAD_FAIL, "4");
        errorCodeMap.put(MainErrorType.HTTP_ACTION_NOT_ALLOWED, "5");
        errorCodeMap.put(MainErrorType.INVALID_ENCODING, "6");
        errorCodeMap.put(MainErrorType.FORBIDDEN_REQUEST, "7");
        errorCodeMap.put(MainErrorType.METHOD_OBSOLETED, "8");
        errorCodeMap.put(MainErrorType.BUSINESS_LOGIC_ERROR, "9");
        errorCodeMap.put(MainErrorType.MISSING_SESSION, "20");
        errorCodeMap.put(MainErrorType.INVALID_SESSION, "21");
        errorCodeMap.put(MainErrorType.MISSING_APP_KEY, "22");
        errorCodeMap.put(MainErrorType.INVALID_APP_KEY, "23");
        errorCodeMap.put(MainErrorType.MISSING_SIGNATURE, "24");
        errorCodeMap.put(MainErrorType.INVALID_SIGNATURE, "25");
        errorCodeMap.put(MainErrorType.MISSING_METHOD, "26");
        errorCodeMap.put(MainErrorType.INVALID_METHOD, "27");
        errorCodeMap.put(MainErrorType.MISSING_VERSION, "28");
        errorCodeMap.put(MainErrorType.INVALID_VERSION, "29");
        errorCodeMap.put(MainErrorType.UNSUPPORTED_VERSION, "30");
        errorCodeMap.put(MainErrorType.INVALID_FORMAT, "31");
        errorCodeMap.put(MainErrorType.MISSING_REQUIRED_ARGUMENTS, "32");
        errorCodeMap.put(MainErrorType.INVALID_ARGUMENTS, "33");
        errorCodeMap.put(MainErrorType.EXCEED_USER_INVOKE_LIMITED, "34");
        errorCodeMap.put(MainErrorType.EXCEED_SESSION_INVOKE_LIMITED, "35");
        errorCodeMap.put(MainErrorType.EXCEED_APP_INVOKE_LIMITED, "36");
        errorCodeMap.put(MainErrorType.EXCEED_APP_INVOKE_FREQUENCY_LIMITED, "37");
        errorCodeMap.put(MainErrorType.MISSING_TIMESTAMP, "38");
        errorCodeMap.put(MainErrorType.INVALID_TIMESTAMP, "39");
    }

    public String value() {
        return errorCodeMap.get(this);
    }
}

