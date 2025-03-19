package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiushezhangpingbiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiushezhangpingbiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiushezhangpingbiView;


/**
 * 优秀舍长评比
 *
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
public interface YouxiushezhangpingbiService extends IService<YouxiushezhangpingbiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiushezhangpingbiVO> selectListVO(Wrapper<YouxiushezhangpingbiEntity> wrapper);
   	
   	YouxiushezhangpingbiVO selectVO(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
   	
   	List<YouxiushezhangpingbiView> selectListView(Wrapper<YouxiushezhangpingbiEntity> wrapper);
   	
   	YouxiushezhangpingbiView selectView(@Param("ew") Wrapper<YouxiushezhangpingbiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiushezhangpingbiEntity> wrapper);
   	
}

