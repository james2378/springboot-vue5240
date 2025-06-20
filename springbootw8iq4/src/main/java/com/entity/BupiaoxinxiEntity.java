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
 * 补票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-01 10:36:03
 */
@TableName("bupiaoxinxi")
public class BupiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BupiaoxinxiEntity() {
		
	}
	
	public BupiaoxinxiEntity(T t) {
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
	 * 补票编号
	 */
					
	private String bupiaobianhao;
	
	/**
	 * 补票时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date bupiaoshijian;
	
	/**
	 * 车次号
	 */
					
	private String checihao;
	
	/**
	 * 车票价格
	 */
					
	private String chepiaojiage;
	
	/**
	 * 上车点
	 */
					
	private String shangchedian;
	
	/**
	 * 下车点
	 */
					
	private String xiachedian;
	
	/**
	 * 补票备注
	 */
					
	private String bupiaobeizhu;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
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
	 * 设置：补票编号
	 */
	public void setBupiaobianhao(String bupiaobianhao) {
		this.bupiaobianhao = bupiaobianhao;
	}
	/**
	 * 获取：补票编号
	 */
	public String getBupiaobianhao() {
		return bupiaobianhao;
	}
	/**
	 * 设置：补票时间
	 */
	public void setBupiaoshijian(Date bupiaoshijian) {
		this.bupiaoshijian = bupiaoshijian;
	}
	/**
	 * 获取：补票时间
	 */
	public Date getBupiaoshijian() {
		return bupiaoshijian;
	}
	/**
	 * 设置：车次号
	 */
	public void setChecihao(String checihao) {
		this.checihao = checihao;
	}
	/**
	 * 获取：车次号
	 */
	public String getChecihao() {
		return checihao;
	}
	/**
	 * 设置：车票价格
	 */
	public void setChepiaojiage(String chepiaojiage) {
		this.chepiaojiage = chepiaojiage;
	}
	/**
	 * 获取：车票价格
	 */
	public String getChepiaojiage() {
		return chepiaojiage;
	}
	/**
	 * 设置：上车点
	 */
	public void setShangchedian(String shangchedian) {
		this.shangchedian = shangchedian;
	}
	/**
	 * 获取：上车点
	 */
	public String getShangchedian() {
		return shangchedian;
	}
	/**
	 * 设置：下车点
	 */
	public void setXiachedian(String xiachedian) {
		this.xiachedian = xiachedian;
	}
	/**
	 * 获取：下车点
	 */
	public String getXiachedian() {
		return xiachedian;
	}
	/**
	 * 设置：补票备注
	 */
	public void setBupiaobeizhu(String bupiaobeizhu) {
		this.bupiaobeizhu = bupiaobeizhu;
	}
	/**
	 * 获取：补票备注
	 */
	public String getBupiaobeizhu() {
		return bupiaobeizhu;
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
