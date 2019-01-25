package com.qianyan.passbook.merchants.dao;

import com.qianyan.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Merchants Dao 接口</h1>
 * Created by shijunhong
 * */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {

    /**
     * <h2>根据id，获取商户对象</h1>
     * @param id 商户id
     * @return {@link Merchants}
     *  */
    Merchants findById(int id);


    /**
     * <h2>根据商户名称，获取商户对象</h1>
     * @param name 商户名称
     * @return {@link Merchants}
     *  */
    Merchants findByName(String name);
}
