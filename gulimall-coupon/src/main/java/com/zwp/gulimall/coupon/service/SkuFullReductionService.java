package com.zwp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.to.SkuReductionTo;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:07:18
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

