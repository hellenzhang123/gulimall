package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hellen
 * @email 751549637@qq.com
 * @date 2020-07-06 11:34:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
