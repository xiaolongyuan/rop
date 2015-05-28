/**
 * 版权声明： 版权所有 违者必究 2012
 * 日    期：12-6-8
 */
package com.rop.annotation;

import org.springframework.util.StringUtils;

/**
 * <pre>
 *   请求类型的方法
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 * @sine 1.1 添加新方法 筱龙缘 2015.05.27
 */
public enum HttpAction {


    GET, POST,PUT,DELETE;

    public static HttpAction fromValue(String value) {

        if(!StringUtils.hasText(value)){
            return POST;
        }

        value = value.toUpperCase();

        if (GET.name().equals(value)) {
            return GET;
        } else if (POST.name().equals(value)) {
            return POST;
        } else if (PUT.name().equals(value)) {
            return PUT;
        } else if (DELETE.name().equals(value)) {
            return DELETE;
        }else {
            return POST;
        }
    }
}

