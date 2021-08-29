package com.zwp.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 17:19:37
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);
}

