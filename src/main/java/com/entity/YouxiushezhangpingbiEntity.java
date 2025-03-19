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
 * 优秀舍长评比
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("youxiushezhangpingbi")
public class YouxiushezhangpingbiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxiushezhangpingbiEntity() {
		
	}
	
	public YouxiushezhangpingbiEntity(T t) {
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
	 * 图片
	 */
					
	private String tupian;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingbishijian;
	
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
