package com.entity.model;

import com.entity.SusherenyuandiaodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宿舍人员调动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public class SusherenyuandiaodongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍长账号
	 */
	
	private String sushezhangzhanghao;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 情况说明
	 */
	
	private String qingkuangshuoming;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：宿舍长账号
	 */
	 
	public void setSushezhangzhanghao(String sushezhangzhanghao) {
		this.sushezhangzhanghao = sushezhangzhanghao;
	}
	
	/**
	 * 获取：宿舍长账号
	 */
	public String getSushezhangzhanghao() {
		return sushezhangzhanghao;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
				
	
	/**
	 * 设置：情况说明
	 */
	 
	public void setQingkuangshuoming(String qingkuangshuoming) {
		this.qingkuangshuoming = qingkuangshuoming;
	}
	
	/**
	 * 获取：情况说明
	 */
	public String getQingkuangshuoming() {
		return qingkuangshuoming;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
