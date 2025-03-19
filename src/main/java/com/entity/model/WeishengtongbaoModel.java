package com.entity.model;

import com.entity.WeishengtongbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 卫生通报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public class WeishengtongbaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 存在问题
	 */
	
	private String cunzaiwenti;
		
	/**
	 * 几点要求
	 */
	
	private String jidianyaoqiu;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：存在问题
	 */
	 
	public void setCunzaiwenti(String cunzaiwenti) {
		this.cunzaiwenti = cunzaiwenti;
	}
	
	/**
	 * 获取：存在问题
	 */
	public String getCunzaiwenti() {
		return cunzaiwenti;
	}
				
	
	/**
	 * 设置：几点要求
	 */
	 
	public void setJidianyaoqiu(String jidianyaoqiu) {
		this.jidianyaoqiu = jidianyaoqiu;
	}
	
	/**
	 * 获取：几点要求
	 */
	public String getJidianyaoqiu() {
		return jidianyaoqiu;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
