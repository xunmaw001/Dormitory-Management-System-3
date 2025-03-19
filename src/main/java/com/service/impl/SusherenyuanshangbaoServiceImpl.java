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


import com.dao.SusherenyuanshangbaoDao;
import com.entity.SusherenyuanshangbaoEntity;
import com.service.SusherenyuanshangbaoService;
import com.entity.vo.SusherenyuanshangbaoVO;
import com.entity.view.SusherenyuanshangbaoView;

@Service("susherenyuanshangbaoService")
public class SusherenyuanshangbaoServiceImpl extends ServiceImpl<SusherenyuanshangbaoDao, SusherenyuanshangbaoEntity> implements SusherenyuanshangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusherenyuanshangbaoEntity> page = this.selectPage(
                new Query<SusherenyuanshangbaoEntity>(params).getPage(),
                new EntityWrapper<SusherenyuanshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusherenyuanshangbaoEntity> wrapper) {
		  Page<SusherenyuanshangbaoView> page =new Query<SusherenyuanshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusherenyuanshangbaoVO> selectListVO(Wrapper<SusherenyuanshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusherenyuanshangbaoVO selectVO(Wrapper<SusherenyuanshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusherenyuanshangbaoView> selectListView(Wrapper<SusherenyuanshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusherenyuanshangbaoView selectView(Wrapper<SusherenyuanshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
