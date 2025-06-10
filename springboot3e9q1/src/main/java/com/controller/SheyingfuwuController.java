package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SheyingfuwuEntity;
import com.entity.view.SheyingfuwuView;

import com.service.SheyingfuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 摄影服务
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
@RestController
@RequestMapping("/sheyingfuwu")
public class SheyingfuwuController {
    @Autowired
    private SheyingfuwuService sheyingfuwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SheyingfuwuEntity sheyingfuwu, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("sheyingshi")) {
			sheyingfuwu.setSheyingshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SheyingfuwuEntity> ew = new EntityWrapper<SheyingfuwuEntity>();
		PageUtils page = sheyingfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sheyingfuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SheyingfuwuEntity sheyingfuwu, HttpServletRequest request){
        EntityWrapper<SheyingfuwuEntity> ew = new EntityWrapper<SheyingfuwuEntity>();
		PageUtils page = sheyingfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sheyingfuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SheyingfuwuEntity sheyingfuwu){
       	EntityWrapper<SheyingfuwuEntity> ew = new EntityWrapper<SheyingfuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sheyingfuwu, "sheyingfuwu")); 
        return R.ok().put("data", sheyingfuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SheyingfuwuEntity sheyingfuwu){
        EntityWrapper< SheyingfuwuEntity> ew = new EntityWrapper< SheyingfuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sheyingfuwu, "sheyingfuwu")); 
		SheyingfuwuView sheyingfuwuView =  sheyingfuwuService.selectView(ew);
		return R.ok("查询摄影服务成功").put("data", sheyingfuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SheyingfuwuEntity sheyingfuwu = sheyingfuwuService.selectById(id);
        return R.ok().put("data", sheyingfuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SheyingfuwuEntity sheyingfuwu = sheyingfuwuService.selectById(id);
        return R.ok().put("data", sheyingfuwu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        SheyingfuwuEntity sheyingfuwu = sheyingfuwuService.selectById(id);
        if(type.equals("1")) {
        	sheyingfuwu.setThumbsupnum(sheyingfuwu.getThumbsupnum()+1);
        } else {
        	sheyingfuwu.setCrazilynum(sheyingfuwu.getCrazilynum()+1);
        }
        sheyingfuwuService.updateById(sheyingfuwu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SheyingfuwuEntity sheyingfuwu, HttpServletRequest request){
    	sheyingfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sheyingfuwu);
        sheyingfuwuService.insert(sheyingfuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SheyingfuwuEntity sheyingfuwu, HttpServletRequest request){
    	sheyingfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sheyingfuwu);
        sheyingfuwuService.insert(sheyingfuwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SheyingfuwuEntity sheyingfuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sheyingfuwu);
        sheyingfuwuService.updateById(sheyingfuwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sheyingfuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SheyingfuwuEntity> wrapper = new EntityWrapper<SheyingfuwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("sheyingshi")) {
			wrapper.eq("sheyingshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = sheyingfuwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
