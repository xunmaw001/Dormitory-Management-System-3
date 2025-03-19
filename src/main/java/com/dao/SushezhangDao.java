package com.dao;

import com.entity.SushezhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushezhangVO;
import com.entity.view.SushezhangView;


/**
 * 宿舍长
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushezhangDao extends BaseMapper<SushezhangEntity> {
	
	List<SushezhangVO> selectListVO(@Param("ew") Wrapper<SushezhangEntity> wrapper);
	
	SushezhangVO selectVO(@Param("ew") Wrapper<SushezhangEntity> wrapper);
	
	List<SushezhangView> selectListView(@Param("ew") Wrapper<SushezhangEntity> wrapper);

	List<SushezhangView> selectListView(Pagination page,@Param("ew") Wrapper<SushezhangEntity> wrapper);
	
	SushezhangView selectView(@Param("ew") Wrapper<SushezhangEntity> wrapper);
	
}
