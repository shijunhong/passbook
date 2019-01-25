package com.qianyan.passbook.merchants.security;


/**
 *<h1>用 THreadLocal 去单独存储每一个线程携带的 TOKEN 信息</h1>
 * Created by shijunhong
 */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<>();
    public static String getToken(){
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    public static void clearAccessKey(){
        token.remove();
    }
}
