package com.entity.view;

import com.entity.YouxiushezhangpingbiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优秀舍长评比
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("youxiushezhangpingbi")
public class YouxiushezhangpingbiView  extends YouxiushezhangpingbiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiushezhangpingbiView(){
	}
 
 	public YouxiushezhangpingbiView(YouxiushezhangpingbiEntity youxiushezhangpingbiEntity){
 	try {
			BeanUtils.copyProperties(this, youxiushezhangpingbiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
