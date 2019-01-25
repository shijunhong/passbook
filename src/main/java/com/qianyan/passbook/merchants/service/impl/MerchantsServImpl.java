package com.qianyan.passbook.merchants.service.impl;

import com.qianyan.passbook.merchants.constant.ErrorCode;
import com.qianyan.passbook.merchants.dao.MerchantsDao;
import com.qianyan.passbook.merchants.service.IMerchantsServ;
import com.qianyan.passbook.merchants.vo.CreateMerchantesRequest;
import com.qianyan.passbook.merchants.vo.CreateMerchantsResponse;
import com.qianyan.passbook.merchants.vo.PassTemplate;
import com.qianyan.passbook.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>商户服务接口实现</h1>
 * Created by shijunhong
 * */

@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {


    /* Merchants 数据库接口*/
    private MerchantsDao merchantsDao;

    @Autowired
    public MerchantsServImpl(MerchantsDao merchantsDao) {
        this.merchantsDao = merchantsDao;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantesRequest request) {
        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();
        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode!=ErrorCode.SUCCESS){
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        }else{
            merchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }
        response.setData(merchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        return null;
    }

    @Override
    public Response dropPassTemplate(PassTemplate passTemplate) {
        return null;
    }
}
