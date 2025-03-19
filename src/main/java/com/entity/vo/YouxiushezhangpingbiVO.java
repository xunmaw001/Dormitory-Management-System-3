package com.entity.vo;

import com.entity.YouxiushezhangpingbiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 优秀舍长评比
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public class YouxiushezhangpingbiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 舍友姓名
	 */
	
	private String sheyouxingming;
		
	/**
	 * 当选内容
	 */
	
	private String dangxuanneirong;
		
	/**
	 * 评比时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingbishijian;
				
	
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
	 * 设置：舍友姓名
	 */
	 
	public void setSheyouxingming(String sheyouxingming) {
		this.sheyouxingming = sheyouxingming;
	}
	
	/**
	 * 获取：舍友姓名
	 */
	public String getSheyouxingming() {
		return sheyouxingming;
	}
				
	
	/**
	 * 设置：当选内容
	 */
	 
	public void setDangxuanneirong(String dangxuanneirong) {
		this.dangxuanneirong = dangxuanneirong;
	}
	
	/**
	 * 获取：当选内容
	 */
	public String getDangxuanneirong() {
		return dangxuanneirong;
	}
				
	
	/**
	 * 设置：评比时间
	 */
	 
	public void setPingbishijian(Date pingbishijian) {
		this.pingbishijian = pingbishijian;
	}
	
	/**
	 * 获取：评比时间
	 */
	public Date getPingbishijian() {
		return pingbishijian;
	}
			
}
