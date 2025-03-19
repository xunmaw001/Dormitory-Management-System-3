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


import com.dao.SusherenyuandiaodongDao;
import com.entity.SusherenyuandiaodongEntity;
import com.service.SusherenyuandiaodongService;
import com.entity.vo.SusherenyuandiaodongVO;
import com.entity.view.SusherenyuandiaodongView;

@Service("susherenyuandiaodongService")
public class SusherenyuandiaodongServiceImpl extends ServiceImpl<SusherenyuandiaodongDao, SusherenyuandiaodongEntity> implements SusherenyuandiaodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusherenyuandiaodongEntity> page = this.selectPage(
                new Query<SusherenyuandiaodongEntity>(params).getPage(),
                new EntityWrapper<SusherenyuandiaodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusherenyuandiaodongEntity> wrapper) {
		  Page<SusherenyuandiaodongView> page =new Query<SusherenyuandiaodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusherenyuandiaodongVO> selectListVO(Wrapper<SusherenyuandiaodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusherenyuandiaodongVO selectVO(Wrapper<SusherenyuandiaodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusherenyuandiaodongView> selectListView(Wrapper<SusherenyuandiaodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusherenyuandiaodongView selectView(Wrapper<SusherenyuandiaodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
