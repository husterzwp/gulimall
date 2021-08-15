package com.zwp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 17:10:56
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

