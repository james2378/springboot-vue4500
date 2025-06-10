package com.entity.model;

import com.entity.SheyingzuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 摄影作品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public class SheyingzuopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 摄影师账号
	 */
	
	private String sheyingshizhanghao;
		
	/**
	 * 摄影师姓名
	 */
	
	private String sheyingshixingming;
		
	/**
	 * 作品一览
	 */
	
	private String zuopinyilan;
		
	/**
	 * 作品介绍
	 */
	
	private String zuopinjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：摄影师账号
	 */
	 
	public void setSheyingshizhanghao(String sheyingshizhanghao) {
		this.sheyingshizhanghao = sheyingshizhanghao;
	}
	
	/**
	 * 获取：摄影师账号
	 */
	public String getSheyingshizhanghao() {
		return sheyingshizhanghao;
	}
				
	
	/**
	 * 设置：摄影师姓名
	 */
	 
	public void setSheyingshixingming(String sheyingshixingming) {
		this.sheyingshixingming = sheyingshixingming;
	}
	
	/**
	 * 获取：摄影师姓名
	 */
	public String getSheyingshixingming() {
		return sheyingshixingming;
	}
				
	
	/**
	 * 设置：作品一览
	 */
	 
	public void setZuopinyilan(String zuopinyilan) {
		this.zuopinyilan = zuopinyilan;
	}
	
	/**
	 * 获取：作品一览
	 */
	public String getZuopinyilan() {
		return zuopinyilan;
	}
				
	
	/**
	 * 设置：作品介绍
	 */
	 
	public void setZuopinjieshao(String zuopinjieshao) {
		this.zuopinjieshao = zuopinjieshao;
	}
	
	/**
	 * 获取：作品介绍
	 */
	public String getZuopinjieshao() {
		return zuopinjieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
