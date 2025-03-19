package com.entity.view;

import com.entity.SusherenyuanshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍人员上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("susherenyuanshangbao")
public class SusherenyuanshangbaoView  extends SusherenyuanshangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SusherenyuanshangbaoView(){
	}
 
 	public SusherenyuanshangbaoView(SusherenyuanshangbaoEntity susherenyuanshangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, susherenyuanshangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
