package com.entity.view;

import com.entity.DiscusssheyingfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影服务评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
@TableName("discusssheyingfuwu")
public class DiscusssheyingfuwuView  extends DiscusssheyingfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusssheyingfuwuView(){
	}
 
 	public DiscusssheyingfuwuView(DiscusssheyingfuwuEntity discusssheyingfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, discusssheyingfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
