package com.dao;

import com.entity.SushetonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushetonggaoVO;
import com.entity.view.SushetonggaoView;


/**
 * 宿舍通告
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushetonggaoDao extends BaseMapper<SushetonggaoEntity> {
	
	List<SushetonggaoVO> selectListVO(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
	
	SushetonggaoVO selectVO(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
	
	List<SushetonggaoView> selectListView(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);

	List<SushetonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
	
	SushetonggaoView selectView(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
	
}
