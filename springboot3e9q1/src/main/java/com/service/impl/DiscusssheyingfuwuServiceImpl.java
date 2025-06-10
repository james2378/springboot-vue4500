package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusssheyingfuwuDao;
import com.entity.DiscusssheyingfuwuEntity;
import com.service.DiscusssheyingfuwuService;
import com.entity.vo.DiscusssheyingfuwuVO;
import com.entity.view.DiscusssheyingfuwuView;

@Service("discusssheyingfuwuService")
public class DiscusssheyingfuwuServiceImpl extends ServiceImpl<DiscusssheyingfuwuDao, DiscusssheyingfuwuEntity> implements DiscusssheyingfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssheyingfuwuEntity> page = this.selectPage(
                new Query<DiscusssheyingfuwuEntity>(params).getPage(),
                new EntityWrapper<DiscusssheyingfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssheyingfuwuEntity> wrapper) {
		  Page<DiscusssheyingfuwuView> page =new Query<DiscusssheyingfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssheyingfuwuVO> selectListVO(Wrapper<DiscusssheyingfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssheyingfuwuVO selectVO(Wrapper<DiscusssheyingfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssheyingfuwuView> selectListView(Wrapper<DiscusssheyingfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssheyingfuwuView selectView(Wrapper<DiscusssheyingfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
