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


import com.dao.ShoufeileixingDao;
import com.entity.ShoufeileixingEntity;
import com.service.ShoufeileixingService;
import com.entity.vo.ShoufeileixingVO;
import com.entity.view.ShoufeileixingView;

@Service("shoufeileixingService")
public class ShoufeileixingServiceImpl extends ServiceImpl<ShoufeileixingDao, ShoufeileixingEntity> implements ShoufeileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoufeileixingEntity> page = this.selectPage(
                new Query<ShoufeileixingEntity>(params).getPage(),
                new EntityWrapper<ShoufeileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoufeileixingEntity> wrapper) {
		  Page<ShoufeileixingView> page =new Query<ShoufeileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoufeileixingVO> selectListVO(Wrapper<ShoufeileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoufeileixingVO selectVO(Wrapper<ShoufeileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoufeileixingView> selectListView(Wrapper<ShoufeileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoufeileixingView selectView(Wrapper<ShoufeileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
