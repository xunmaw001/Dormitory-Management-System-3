package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushezhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushezhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushezhangView;


/**
 * 宿舍长
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
public interface SushezhangService extends IService<SushezhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushezhangVO> selectListVO(Wrapper<SushezhangEntity> wrapper);
   	
   	SushezhangVO selectVO(@Param("ew") Wrapper<SushezhangEntity> wrapper);
   	
   	List<SushezhangView> selectListView(Wrapper<SushezhangEntity> wrapper);
   	
   	SushezhangView selectView(@Param("ew") Wrapper<SushezhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushezhangEntity> wrapper);
   	
}

