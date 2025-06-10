package com.entity.view;

import com.entity.SheyingfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 摄影服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
@TableName("sheyingfuwu")
public class SheyingfuwuView  extends SheyingfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SheyingfuwuView(){
	}
 
 	public SheyingfuwuView(SheyingfuwuEntity sheyingfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, sheyingfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
