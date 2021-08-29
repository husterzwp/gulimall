package com.zwp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwp.gulimall.common.utils.PageUtils;
import com.zwp.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:17:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径[父路径/子路径/子孙路径]
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}

