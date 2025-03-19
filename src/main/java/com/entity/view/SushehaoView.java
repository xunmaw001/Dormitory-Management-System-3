package com.entity.view;

import com.entity.SushehaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
@TableName("sushehao")
public class SushehaoView  extends SushehaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushehaoView(){
	}
 
 	public SushehaoView(SushehaoEntity sushehaoEntity){
 	try {
			BeanUtils.copyProperties(this, sushehaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
