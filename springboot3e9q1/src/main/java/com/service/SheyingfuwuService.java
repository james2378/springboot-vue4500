package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SheyingfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SheyingfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SheyingfuwuView;


/**
 * 摄影服务
 *
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface SheyingfuwuService extends IService<SheyingfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SheyingfuwuVO> selectListVO(Wrapper<SheyingfuwuEntity> wrapper);
   	
   	SheyingfuwuVO selectVO(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
   	
   	List<SheyingfuwuView> selectListView(Wrapper<SheyingfuwuEntity> wrapper);
   	
   	SheyingfuwuView selectView(@Param("ew") Wrapper<SheyingfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SheyingfuwuEntity> wrapper);
   	
}

