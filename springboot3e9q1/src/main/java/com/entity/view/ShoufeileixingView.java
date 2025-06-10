package com.entity.view;

import com.entity.ShoufeileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收费类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
@TableName("shoufeileixing")
public class ShoufeileixingView  extends ShoufeileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoufeileixingView(){
	}
 
 	public ShoufeileixingView(ShoufeileixingEntity shoufeileixingEntity){
 	try {
			BeanUtils.copyProperties(this, shoufeileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
