package com.qianyan.passbook.merchants.service;

import com.alibaba.fastjson.JSON;
import com.qianyan.passbook.merchants.vo.CreateMerchantesRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <h1>商户服务测试类</h1>
 * Created by shijunhong
 * */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {
    @Autowired
    private IMerchantsServ merchantsServ;

    @Test
    public void testCreateMerchantSErv(){
        CreateMerchantesRequest request = new CreateMerchantesRequest();
        request.setName("qianyan");
        request.setLogoUrl("www.baidu.com");
        request.setBusinessLicenseUrl("www.baidu.com");
        request.setPhone("15000000000");
        request.setAddress("beijing");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

}
