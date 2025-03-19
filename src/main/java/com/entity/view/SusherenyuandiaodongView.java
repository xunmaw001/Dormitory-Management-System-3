package com.entity.view;

import com.entity.SusherenyuandiaodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍人员调动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@TableName("susherenyuandiaodong")
public class SusherenyuandiaodongView  extends SusherenyuandiaodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SusherenyuandiaodongView(){
	}
 
 	public SusherenyuandiaodongView(SusherenyuandiaodongEntity susherenyuandiaodongEntity){
 	try {
			BeanUtils.copyProperties(this, susherenyuandiaodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
