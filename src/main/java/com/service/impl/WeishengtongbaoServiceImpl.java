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


import com.dao.WeishengtongbaoDao;
import com.entity.WeishengtongbaoEntity;
import com.service.WeishengtongbaoService;
import com.entity.vo.WeishengtongbaoVO;
import com.entity.view.WeishengtongbaoView;

@Service("weishengtongbaoService")
public class WeishengtongbaoServiceImpl extends ServiceImpl<WeishengtongbaoDao, WeishengtongbaoEntity> implements WeishengtongbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeishengtongbaoEntity> page = this.selectPage(
                new Query<WeishengtongbaoEntity>(params).getPage(),
                new EntityWrapper<WeishengtongbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeishengtongbaoEntity> wrapper) {
		  Page<WeishengtongbaoView> page =new Query<WeishengtongbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeishengtongbaoVO> selectListVO(Wrapper<WeishengtongbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeishengtongbaoVO selectVO(Wrapper<WeishengtongbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeishengtongbaoView> selectListView(Wrapper<WeishengtongbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeishengtongbaoView selectView(Wrapper<WeishengtongbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
