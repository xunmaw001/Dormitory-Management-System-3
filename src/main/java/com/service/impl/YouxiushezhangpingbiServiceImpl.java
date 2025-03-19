package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YouxiushezhangpingbiDao;
import com.entity.YouxiushezhangpingbiEntity;
import com.service.YouxiushezhangpingbiService;
import com.entity.vo.YouxiushezhangpingbiVO;
import com.entity.view.YouxiushezhangpingbiView;

@Service("youxiushezhangpingbiService")
public class YouxiushezhangpingbiServiceImpl extends ServiceImpl<YouxiushezhangpingbiDao, YouxiushezhangpingbiEntity> implements YouxiushezhangpingbiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiushezhangpingbiEntity> page = this.selectPage(
                new Query<YouxiushezhangpingbiEntity>(params).getPage(),
                new EntityWrapper<YouxiushezhangpingbiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiushezhangpingbiEntity> wrapper) {
		  Page<YouxiushezhangpingbiView> page =new Query<YouxiushezhangpingbiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxiushezhangpingbiVO> selectListVO(Wrapper<YouxiushezhangpingbiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiushezhangpingbiVO selectVO(Wrapper<YouxiushezhangpingbiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiushezhangpingbiView> selectListView(Wrapper<YouxiushezhangpingbiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiushezhangpingbiView selectView(Wrapper<YouxiushezhangpingbiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
