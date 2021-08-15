package com.zwp.gulimall.coupon.dao;

import com.zwp.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:07:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
