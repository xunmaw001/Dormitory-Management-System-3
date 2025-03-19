package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusherenyuanshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusherenyuanshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusherenyuanshangbaoView;


/**
 * 宿舍人员上报
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface SusherenyuanshangbaoService extends IService<SusherenyuanshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusherenyuanshangbaoVO> selectListVO(Wrapper<SusherenyuanshangbaoEntity> wrapper);
   	
   	SusherenyuanshangbaoVO selectVO(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
   	
   	List<SusherenyuanshangbaoView> selectListView(Wrapper<SusherenyuanshangbaoEntity> wrapper);
   	
   	SusherenyuanshangbaoView selectView(@Param("ew") Wrapper<SusherenyuanshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusherenyuanshangbaoEntity> wrapper);
   	
}

