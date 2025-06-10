package com.dao;

import com.entity.SheyingfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SheyingfuwuVO;
import com.entity.view.SheyingfuwuView;


/**
 * 摄影服务
 * 
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface SheyingfuwuDao extends BaseMapper<SheyingfuwuEntity> {
	
	List<SheyingfuwuVO> selectListVO(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
	
	SheyingfuwuVO selectVO(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
	
	List<SheyingfuwuView> selectListView(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);

	List<SheyingfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
	
	SheyingfuwuView selectView(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
	
}
