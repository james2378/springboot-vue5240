package com.entity.vo;

import com.entity.ChepiaotuipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车票退票
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-01 10:36:03
 */
public class ChepiaotuipiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车序号
	 */
	
	private String chexuhao;
		
	/**
	 * 火车类型
	 */
	
	private String huocheleixing;
		
	/**
	 * 车次号
	 */
	
	private String checihao;
		
	/**
	 * 起点站
	 */
	
	private String qidianzhan;
		
	/**
	 * 终点站
	 */
	
	private String zhongdianzhan;
		
	/**
	 * 开车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaicheshijian;
		
	/**
	 * 到站时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daozhanshijian;
		
	/**
	 * 车票类型
	 */
	
	private String chepiaoleixing;
		
	/**
	 * 座位类型
	 */
	
	private String zuoweileixing;
		
	/**
	 * 车票价格
	 */
	
	private Integer chepiaojiage;
		
	/**
	 * 退票时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuipiaoshijian;
		
	/**
	 * 退票备注
	 */
	
	private String tuipiaobeizhu;
		
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
	 * 设置：车序号
	 */
	 
	public void setChexuhao(String chexuhao) {
		this.chexuhao = chexuhao;
	}
	
	/**
	 * 获取：车序号
	 */
	public String getChexuhao() {
		return chexuhao;
	}
				
	
	/**
	 * 设置：火车类型
	 */
	 
	public void setHuocheleixing(String huocheleixing) {
		this.huocheleixing = huocheleixing;
	}
	
	/**
	 * 获取：火车类型
	 */
	public String getHuocheleixing() {
		return huocheleixing;
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
	 * 设置：起点站
	 */
	 
	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}
	
	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}
				
	
	/**
	 * 设置：终点站
	 */
	 
	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}
	
	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}
				
	
	/**
	 * 设置：开车时间
	 */
	 
	public void setKaicheshijian(Date kaicheshijian) {
		this.kaicheshijian = kaicheshijian;
	}
	
	/**
	 * 获取：开车时间
	 */
	public Date getKaicheshijian() {
		return kaicheshijian;
	}
				
	
	/**
	 * 设置：到站时间
	 */
	 
	public void setDaozhanshijian(Date daozhanshijian) {
		this.daozhanshijian = daozhanshijian;
	}
	
	/**
	 * 获取：到站时间
	 */
	public Date getDaozhanshijian() {
		return daozhanshijian;
	}
				
	
	/**
	 * 设置：车票类型
	 */
	 
	public void setChepiaoleixing(String chepiaoleixing) {
		this.chepiaoleixing = chepiaoleixing;
	}
	
	/**
	 * 获取：车票类型
	 */
	public String getChepiaoleixing() {
		return chepiaoleixing;
	}
				
	
	/**
	 * 设置：座位类型
	 */
	 
	public void setZuoweileixing(String zuoweileixing) {
		this.zuoweileixing = zuoweileixing;
	}
	
	/**
	 * 获取：座位类型
	 */
	public String getZuoweileixing() {
		return zuoweileixing;
	}
				
	
	/**
	 * 设置：车票价格
	 */
	 
	public void setChepiaojiage(Integer chepiaojiage) {
		this.chepiaojiage = chepiaojiage;
	}
	
	/**
	 * 获取：车票价格
	 */
	public Integer getChepiaojiage() {
		return chepiaojiage;
	}
				
	
	/**
	 * 设置：退票时间
	 */
	 
	public void setTuipiaoshijian(Date tuipiaoshijian) {
		this.tuipiaoshijian = tuipiaoshijian;
	}
	
	/**
	 * 获取：退票时间
	 */
	public Date getTuipiaoshijian() {
		return tuipiaoshijian;
	}
				
	
	/**
	 * 设置：退票备注
	 */
	 
	public void setTuipiaobeizhu(String tuipiaobeizhu) {
		this.tuipiaobeizhu = tuipiaobeizhu;
	}
	
	/**
	 * 获取：退票备注
	 */
	public String getTuipiaobeizhu() {
		return tuipiaobeizhu;
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
			
}
