package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeishengtongbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeishengtongbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeishengtongbaoView;


/**
 * 卫生通报
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface WeishengtongbaoService extends IService<WeishengtongbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeishengtongbaoVO> selectListVO(Wrapper<WeishengtongbaoEntity> wrapper);
   	
   	WeishengtongbaoVO selectVO(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
   	
   	List<WeishengtongbaoView> selectListView(Wrapper<WeishengtongbaoEntity> wrapper);
   	
   	WeishengtongbaoView selectView(@Param("ew") Wrapper<WeishengtongbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeishengtongbaoEntity> wrapper);
   	
}

