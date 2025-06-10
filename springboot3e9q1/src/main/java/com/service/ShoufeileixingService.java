package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoufeileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoufeileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufeileixingView;


/**
 * 收费类型
 *
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface ShoufeileixingService extends IService<ShoufeileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoufeileixingVO> selectListVO(Wrapper<ShoufeileixingEntity> wrapper);
   	
   	ShoufeileixingVO selectVO(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
   	
   	List<ShoufeileixingView> selectListView(Wrapper<ShoufeileixingEntity> wrapper);
   	
   	ShoufeileixingView selectView(@Param("ew") Wrapper<ShoufeileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoufeileixingEntity> wrapper);
   	
}

