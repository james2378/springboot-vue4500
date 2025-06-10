package com.dao;

import com.entity.DiscusssheyingfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssheyingfuwuVO;
import com.entity.view.DiscusssheyingfuwuView;


/**
 * 摄影服务评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface DiscusssheyingfuwuDao extends BaseMapper<DiscusssheyingfuwuEntity> {
	
	List<DiscusssheyingfuwuVO> selectListVO(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
	
	DiscusssheyingfuwuVO selectVO(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
	
	List<DiscusssheyingfuwuView> selectListView(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);

	List<DiscusssheyingfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
	
	DiscusssheyingfuwuView selectView(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
	
}
