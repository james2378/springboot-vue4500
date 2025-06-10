package com.dao;

import com.entity.ShoufeileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoufeileixingVO;
import com.entity.view.ShoufeileixingView;


/**
 * 收费类型
 * 
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface ShoufeileixingDao extends BaseMapper<ShoufeileixingEntity> {
	
	List<ShoufeileixingVO> selectListVO(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
	
	ShoufeileixingVO selectVO(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
	
	List<ShoufeileixingView> selectListView(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);

	List<ShoufeileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
	
	ShoufeileixingView selectView(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
	
}
