package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusherenyuandiaodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusherenyuandiaodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusherenyuandiaodongView;


/**
 * 宿舍人员调动
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface SusherenyuandiaodongService extends IService<SusherenyuandiaodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusherenyuandiaodongVO> selectListVO(Wrapper<SusherenyuandiaodongEntity> wrapper);
   	
   	SusherenyuandiaodongVO selectVO(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
   	
   	List<SusherenyuandiaodongView> selectListView(Wrapper<SusherenyuandiaodongEntity> wrapper);
   	
   	SusherenyuandiaodongView selectView(@Param("ew") Wrapper<SusherenyuandiaodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusherenyuandiaodongEntity> wrapper);
   	
}

