package com.zwp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:17:40
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity spuInfoDescEntity);
}

