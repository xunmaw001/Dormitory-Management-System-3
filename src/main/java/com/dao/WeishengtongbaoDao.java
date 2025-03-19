package com.dao;

import com.entity.WeishengtongbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeishengtongbaoVO;
import com.entity.view.WeishengtongbaoView;


/**
 * 卫生通报
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface WeishengtongbaoDao extends BaseMapper<WeishengtongbaoEntity> {
	
	List<WeishengtongbaoVO> selectListVO(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
	
	WeishengtongbaoVO selectVO(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
	
	List<WeishengtongbaoView> selectListView(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);

	List<WeishengtongbaoView> selectListView(Pagination page,@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
	
	WeishengtongbaoView selectView(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
	
}
