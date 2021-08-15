package com.zwp.gulimall.member.dao;

import com.zwp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhengweiping
 * @email zhengweiping@gmail.com
 * @date 2021-08-15 16:43:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
