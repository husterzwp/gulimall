package com.zwp.gulimall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwp.gulimall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品库存
 * 
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 17:19:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    /**
     * 添加入库信息
     * @param skuId
     * @param wareId
     * @param skuNum
     */
    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);
}
