package com.entity.model;

import com.entity.XiachexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 下车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-01 10:36:03
 */
public class XiachexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 下车站点
	 */
	
	private String xiachezhandian;
		
	/**
	 * 下车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiacheshijian;
		
	/**
	 * 下车备注
	 */
	
	private String xiachebeizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：下车站点
	 */
	 
	public void setXiachezhandian(String xiachezhandian) {
		this.xiachezhandian = xiachezhandian;
	}
	
	/**
	 * 获取：下车站点
	 */
	public String getXiachezhandian() {
		return xiachezhandian;
	}
				
	
	/**
	 * 设置：下车时间
	 */
	 
	public void setXiacheshijian(Date xiacheshijian) {
		this.xiacheshijian = xiacheshijian;
	}
	
	/**
	 * 获取：下车时间
	 */
	public Date getXiacheshijian() {
		return xiacheshijian;
	}
				
	
	/**
	 * 设置：下车备注
	 */
	 
	public void setXiachebeizhu(String xiachebeizhu) {
		this.xiachebeizhu = xiachebeizhu;
	}
	
	/**
	 * 获取：下车备注
	 */
	public String getXiachebeizhu() {
		return xiachebeizhu;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
