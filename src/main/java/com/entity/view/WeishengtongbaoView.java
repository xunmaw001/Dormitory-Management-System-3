package com.entity.view;

import com.entity.WeishengtongbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卫生通报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("weishengtongbao")
public class WeishengtongbaoView  extends WeishengtongbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeishengtongbaoView(){
	}
 
 	public WeishengtongbaoView(WeishengtongbaoEntity weishengtongbaoEntity){
 	try {
			BeanUtils.copyProperties(this, weishengtongbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
