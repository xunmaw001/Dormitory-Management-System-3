package com.dao;

import com.entity.SusherenyuandiaodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusherenyuandiaodongVO;
import com.entity.view.SusherenyuandiaodongView;


/**
 * 宿舍人员调动
 * 
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface SusherenyuandiaodongDao extends BaseMapper<SusherenyuandiaodongEntity> {
	
	List<SusherenyuandiaodongVO> selectListVO(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
	
	SusherenyuandiaodongVO selectVO(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
	
	List<SusherenyuandiaodongView> selectListView(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);

	List<SusherenyuandiaodongView> selectListView(Pagination page,@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
	
	SusherenyuandiaodongView selectView(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
	
}
