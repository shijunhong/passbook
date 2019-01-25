package com.qianyan.passbook.merchants.vo;

import com.qianyan.passbook.merchants.constant.ErrorCode;
import com.qianyan.passbook.merchants.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h1>投放的优惠券对象定义</h1>
 * Created by shijunhong
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {

    /**所属商户id*/
    private Integer id;

    /**优惠券标题*/
    private String title;


    /**优惠券的摘要*/
    private String summary;

    /**优惠券的详细信息*/
    private String desc;

    /**最大的数限制*/
    private Long limit;

    /**优惠券是否有Token 用于商户核销*/
    private Boolean hasToken; //token 存储于Redis Set中，每次领取从REdis中获取

    /**优惠券背景色*/
    private Integer background;


    /**优惠券开始时间*/
    private Date start;

    /**优惠券结束时间*/
    private Date end;

    /**
     * <h2>校验优惠券对象的有效性</h2>
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     * */
    private ErrorCode validate(MerchantsDao merchantsDao){
        if (null == merchantsDao.findById(id)){
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }
}
