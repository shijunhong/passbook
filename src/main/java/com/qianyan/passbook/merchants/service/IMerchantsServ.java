package com.qianyan.passbook.merchants.service;

import com.qianyan.passbook.merchants.vo.CreateMerchantesRequest;
import com.qianyan.passbook.merchants.vo.PassTemplate;
import com.qianyan.passbook.merchants.vo.Response;

/**
 * <h1>商户服务的接口定义</h1>
 * created by shijunhong
 * */
public interface IMerchantsServ {

    /**
     * <h2>创建商户服务</h2>
     * @param   request {@link CreateMerchantesRequest}创建商户请求
     * @return {@link Response}
     * */
    Response createMerchants(CreateMerchantesRequest request);


    /**
     * <h2>根据id构造商户信息</h2>
     * @param id 商户id
     * @return {@link Response}
     * */
    Response buildMerchantsInfoById(Integer id);


    /**
     * <h2>投放优惠券</h2>
     * @param passTemplate {@link PassTemplate} 优惠券对象
     * @return {@link Response}
     * */
    Response dropPassTemplate(PassTemplate passTemplate);


}
