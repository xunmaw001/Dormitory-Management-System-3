package com.dao;

import com.entity.YouxiushezhangpingbiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiushezhangpingbiVO;
import com.entity.view.YouxiushezhangpingbiView;


/**
 * 优秀舍长评比
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface YouxiushezhangpingbiDao extends BaseMapper<YouxiushezhangpingbiEntity> {
	
	List<YouxiushezhangpingbiVO> selectListVO(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
	
	YouxiushezhangpingbiVO selectVO(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
	
	List<YouxiushezhangpingbiView> selectListView(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);

	List<YouxiushezhangpingbiView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
	
	YouxiushezhangpingbiView selectView(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
	
}
