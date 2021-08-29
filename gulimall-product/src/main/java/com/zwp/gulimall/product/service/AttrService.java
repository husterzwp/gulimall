package com.zwp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.product.entity.AttrEntity;
import com.zwp.gulimall.product.vo.AttrGroupRelationVo;
import com.zwp.gulimall.product.vo.AttrRespVo;
import com.zwp.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:17:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttrById(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

