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


import com.dao.SushezhangDao;
import com.entity.SushezhangEntity;
import com.service.SushezhangService;
import com.entity.vo.SushezhangVO;
import com.entity.view.SushezhangView;

@Service("sushezhangService")
public class SushezhangServiceImpl extends ServiceImpl<SushezhangDao, SushezhangEntity> implements SushezhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushezhangEntity> page = this.selectPage(
                new Query<SushezhangEntity>(params).getPage(),
                new EntityWrapper<SushezhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushezhangEntity> wrapper) {
		  Page<SushezhangView> page =new Query<SushezhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushezhangVO> selectListVO(Wrapper<SushezhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushezhangVO selectVO(Wrapper<SushezhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushezhangView> selectListView(Wrapper<SushezhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushezhangView selectView(Wrapper<SushezhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
