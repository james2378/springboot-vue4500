package com.entity.model;

import com.entity.YuyuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 预约信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 10:53:29
 */
public class YuyuexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 摄影师账号
	 */
	
	private String sheyingshizhanghao;
		
	/**
	 * 摄影师姓名
	 */
	
	private String sheyingshixingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 收费类型
	 */
	
	private String shoufeileixing;
		
	/**
	 * 收费价格
	 */
	
	private Integer shoufeijiage;
		
	/**
	 * 拍摄时长
	 */
	
	private Integer paisheshizhang;
		
	/**
	 * 总金额
	 */
	
	private String zongjine;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 预约地点
	 */
	
	private String yuyuedidian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
	 * 设置：拍摄时长
	 */
	 
	public void setPaisheshizhang(Integer paisheshizhang) {
		this.paisheshizhang = paisheshizhang;
	}
	
	/**
	 * 获取：拍摄时长
	 */
	public Integer getPaisheshizhang() {
		return paisheshizhang;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：预约地点
	 */
	 
	public void setYuyuedidian(String yuyuedidian) {
		this.yuyuedidian = yuyuedidian;
	}
	
	/**
	 * 获取：预约地点
	 */
	public String getYuyuedidian() {
		return yuyuedidian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
