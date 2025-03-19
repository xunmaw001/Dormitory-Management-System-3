package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushehaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushehaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushehaoView;


/**
 * 宿舍号
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushehaoService extends IService<SushehaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushehaoVO> selectListVO(Wrapper<SushehaoEntity> wrapper);
   	
   	SushehaoVO selectVO(@Param("ew") Wrapper<SushehaoEntity> wrapper);
   	
   	List<SushehaoView> selectListView(Wrapper<SushehaoEntity> wrapper);
   	
   	SushehaoView selectView(@Param("ew") Wrapper<SushehaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushehaoEntity> wrapper);
   	
}

