package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 摄影作品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
@TableName("sheyingzuopin")
public class SheyingzuopinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SheyingzuopinEntity() {
		
	}
	
	public SheyingzuopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作品标题
	 */
					
	private String zuopinbiaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作品标题
	 */
	public void setZuopinbiaoti(String zuopinbiaoti) {
		this.zuopinbiaoti = zuopinbiaoti;
	}
	/**
	 * 获取：作品标题
	 */
	public String getZuopinbiaoti() {
		return zuopinbiaoti;
	}
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
