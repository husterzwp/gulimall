package com.zwp.gulimall.product.dao;

import com.zwp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:17:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
