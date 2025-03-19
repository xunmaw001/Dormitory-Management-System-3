package com.dao;

import com.entity.SushehaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushehaoVO;
import com.entity.view.SushehaoView;


/**
 * 宿舍号
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushehaoDao extends BaseMapper<SushehaoEntity> {
	
	List<SushehaoVO> selectListVO(@Param("ew") Wrapper<SushehaoEntity> wrapper);
	
	SushehaoVO selectVO(@Param("ew") Wrapper<SushehaoEntity> wrapper);
	
	List<SushehaoView> selectListView(@Param("ew") Wrapper<SushehaoEntity> wrapper);

	List<SushehaoView> selectListView(Pagination page,@Param("ew") Wrapper<SushehaoEntity> wrapper);
	
	SushehaoView selectView(@Param("ew") Wrapper<SushehaoEntity> wrapper);
	
}
