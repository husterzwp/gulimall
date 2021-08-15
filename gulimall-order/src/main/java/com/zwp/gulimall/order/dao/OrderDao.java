package com.zwp.gulimall.order.dao;

import com.zwp.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 17:10:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
