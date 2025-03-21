package com.entity.view;

import com.entity.SushetonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍通告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
@TableName("sushetonggao")
public class SushetonggaoView  extends SushetonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushetonggaoView(){
	}
 
 	public SushetonggaoView(SushetonggaoEntity sushetonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, sushetonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
