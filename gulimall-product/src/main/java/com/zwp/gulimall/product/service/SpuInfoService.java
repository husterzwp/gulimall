package com.zwp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.product.entity.SpuInfoEntity;
import com.zwp.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:17:40
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);

    PageUtils queryPageByCondtion(Map<String, Object> params);
}

