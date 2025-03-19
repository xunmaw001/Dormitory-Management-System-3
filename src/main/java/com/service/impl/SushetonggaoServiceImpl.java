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


import com.dao.SushetonggaoDao;
import com.entity.SushetonggaoEntity;
import com.service.SushetonggaoService;
import com.entity.vo.SushetonggaoVO;
import com.entity.view.SushetonggaoView;

@Service("sushetonggaoService")
public class SushetonggaoServiceImpl extends ServiceImpl<SushetonggaoDao, SushetonggaoEntity> implements SushetonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushetonggaoEntity> page = this.selectPage(
                new Query<SushetonggaoEntity>(params).getPage(),
                new EntityWrapper<SushetonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushetonggaoEntity> wrapper) {
		  Page<SushetonggaoView> page =new Query<SushetonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushetonggaoVO> selectListVO(Wrapper<SushetonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushetonggaoVO selectVO(Wrapper<SushetonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushetonggaoView> selectListView(Wrapper<SushetonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushetonggaoView selectView(Wrapper<SushetonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
