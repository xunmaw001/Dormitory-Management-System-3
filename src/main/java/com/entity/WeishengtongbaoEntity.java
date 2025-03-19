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
 * 卫生通报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("weishengtongbao")
public class WeishengtongbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeishengtongbaoEntity() {
		
	}
	
	public WeishengtongbaoEntity(T t) {
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
	 * 基本情况
	 */
					
	private String jibenqingkuang;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：基本情况
	 */
	public void setJibenqingkuang(String jibenqingkuang) {
		this.jibenqingkuang = jibenqingkuang;
	}
	/**
	 * 获取：基本情况
	 */
	public String getJibenqingkuang() {
		return jibenqingkuang;
	}
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
