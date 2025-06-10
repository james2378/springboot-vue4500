package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssheyingfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssheyingfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssheyingfuwuView;


/**
 * 摄影服务评论表
 *
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public interface DiscusssheyingfuwuService extends IService<DiscusssheyingfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssheyingfuwuVO> selectListVO(Wrapper<DiscusssheyingfuwuEntity> wrapper);
   	
   	DiscusssheyingfuwuVO selectVO(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
   	
   	List<DiscusssheyingfuwuView> selectListView(Wrapper<DiscusssheyingfuwuEntity> wrapper);
   	
   	DiscusssheyingfuwuView selectView(@Param("ew") Wrapper<DiscusssheyingfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssheyingfuwuEntity> wrapper);
   	
}

