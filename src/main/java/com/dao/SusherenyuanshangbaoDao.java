package com.dao;

import com.entity.SusherenyuanshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusherenyuanshangbaoVO;
import com.entity.view.SusherenyuanshangbaoView;


/**
 * 宿舍人员上报
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface SusherenyuanshangbaoDao extends BaseMapper<SusherenyuanshangbaoEntity> {
	
	List<SusherenyuanshangbaoVO> selectListVO(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
	
	SusherenyuanshangbaoVO selectVO(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
	
	List<SusherenyuanshangbaoView> selectListView(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);

	List<SusherenyuanshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
	
	SusherenyuanshangbaoView selectView(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
	
}
