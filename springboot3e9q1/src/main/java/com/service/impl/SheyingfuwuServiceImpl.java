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


import com.dao.SheyingfuwuDao;
import com.entity.SheyingfuwuEntity;
import com.service.SheyingfuwuService;
import com.entity.vo.SheyingfuwuVO;
import com.entity.view.SheyingfuwuView;

@Service("sheyingfuwuService")
public class SheyingfuwuServiceImpl extends ServiceImpl<SheyingfuwuDao, SheyingfuwuEntity> implements SheyingfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SheyingfuwuEntity> page = this.selectPage(
                new Query<SheyingfuwuEntity>(params).getPage(),
                new EntityWrapper<SheyingfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SheyingfuwuEntity> wrapper) {
		  Page<SheyingfuwuView> page =new Query<SheyingfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SheyingfuwuVO> selectListVO(Wrapper<SheyingfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SheyingfuwuVO selectVO(Wrapper<SheyingfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SheyingfuwuView> selectListView(Wrapper<SheyingfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SheyingfuwuView selectView(Wrapper<SheyingfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
