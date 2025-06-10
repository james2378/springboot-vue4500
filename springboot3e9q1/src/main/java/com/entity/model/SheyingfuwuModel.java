package com.entity.model;

import com.entity.SheyingfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 摄影服务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public class SheyingfuwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 摄影师姓名
	 */
	
	private String sheyingshixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 摄影年限
	 */
	
	private String sheyingnianxian;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 代表作品
	 */
	
	private String daibiaozuopin;
		
	/**
	 * 收费类型
	 */
	
	private String shoufeileixing;
		
	/**
	 * 收费价格
	 */
	
	private Integer shoufeijiage;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：摄影年限
	 */
	 
	public void setSheyingnianxian(String sheyingnianxian) {
		this.sheyingnianxian = sheyingnianxian;
	}
	
	/**
	 * 获取：摄影年限
	 */
	public String getSheyingnianxian() {
		return sheyingnianxian;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：代表作品
	 */
	 
	public void setDaibiaozuopin(String daibiaozuopin) {
		this.daibiaozuopin = daibiaozuopin;
	}
	
	/**
	 * 获取：代表作品
	 */
	public String getDaibiaozuopin() {
		return daibiaozuopin;
	}
				
	
	/**
	 * 设置：收费类型
	 */
	 
	public void setShoufeileixing(String shoufeileixing) {
		this.shoufeileixing = shoufeileixing;
	}
	
	/**
	 * 获取：收费类型
	 */
	public String getShoufeileixing() {
		return shoufeileixing;
	}
				
	
	/**
	 * 设置：收费价格
	 */
	 
	public void setShoufeijiage(Integer shoufeijiage) {
		this.shoufeijiage = shoufeijiage;
	}
	
	/**
	 * 获取：收费价格
	 */
	public Integer getShoufeijiage() {
		return shoufeijiage;
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
