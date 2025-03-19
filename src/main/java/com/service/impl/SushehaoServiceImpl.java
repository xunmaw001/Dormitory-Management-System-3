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


import com.dao.SushehaoDao;
import com.entity.SushehaoEntity;
import com.service.SushehaoService;
import com.entity.vo.SushehaoVO;
import com.entity.view.SushehaoView;

@Service("sushehaoService")
public class SushehaoServiceImpl extends ServiceImpl<SushehaoDao, SushehaoEntity> implements SushehaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushehaoEntity> page = this.selectPage(
                new Query<SushehaoEntity>(params).getPage(),
                new EntityWrapper<SushehaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushehaoEntity> wrapper) {
		  Page<SushehaoView> page =new Query<SushehaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushehaoVO> selectListVO(Wrapper<SushehaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushehaoVO selectVO(Wrapper<SushehaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushehaoView> selectListView(Wrapper<SushehaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushehaoView selectView(Wrapper<SushehaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
