package com.entity.vo;

import com.entity.SusherenyuanshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍人员上报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public class SusherenyuanshangbaoVO  implements Serializable {
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
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 上报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangbaoshijian;
				
	
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
	 * 设置：上报时间
	 */
	 
	public void setShangbaoshijian(Date shangbaoshijian) {
		this.shangbaoshijian = shangbaoshijian;
	}
	
	/**
	 * 获取：上报时间
	 */
	public Date getShangbaoshijian() {
		return shangbaoshijian;
	}
			
}
