package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushetonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushetonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushetonggaoView;


/**
 * 宿舍通告
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushetonggaoService extends IService<SushetonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushetonggaoVO> selectListVO(Wrapper<SushetonggaoEntity> wrapper);
   	
   	SushetonggaoVO selectVO(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
   	
   	List<SushetonggaoView> selectListView(Wrapper<SushetonggaoEntity> wrapper);
   	
   	SushetonggaoView selectView(@Param("ew") Wrapper<SushetonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushetonggaoEntity> wrapper);
   	
}

