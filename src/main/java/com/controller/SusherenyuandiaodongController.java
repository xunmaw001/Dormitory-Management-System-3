package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SusherenyuandiaodongEntity;
import com.entity.view.SusherenyuandiaodongView;

import com.service.SusherenyuandiaodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宿舍人员调动
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-24 15:20:22
 */
@RestController
@RequestMapping("/susherenyuandiaodong")
public class SusherenyuandiaodongController {
    @Autowired
    private SusherenyuandiaodongService susherenyuandiaodongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SusherenyuandiaodongEntity susherenyuandiaodong, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("sushezhang")) {
			susherenyuandiaodong.setSushezhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SusherenyuandiaodongEntity> ew = new EntityWrapper<SusherenyuandiaodongEntity>();
		PageUtils page = susherenyuandiaodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susherenyuandiaodong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SusherenyuandiaodongEntity susherenyuandiaodong, HttpServletRequest request){
        EntityWrapper<SusherenyuandiaodongEntity> ew = new EntityWrapper<SusherenyuandiaodongEntity>();
		PageUtils page = susherenyuandiaodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susherenyuandiaodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SusherenyuandiaodongEntity susherenyuandiaodong){
       	EntityWrapper<SusherenyuandiaodongEntity> ew = new EntityWrapper<SusherenyuandiaodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( susherenyuandiaodong, "susherenyuandiaodong")); 
        return R.ok().put("data", susherenyuandiaodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SusherenyuandiaodongEntity susherenyuandiaodong){
        EntityWrapper< SusherenyuandiaodongEntity> ew = new EntityWrapper< SusherenyuandiaodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( susherenyuandiaodong, "susherenyuandiaodong")); 
		SusherenyuandiaodongView susherenyuandiaodongView =  susherenyuandiaodongService.selectView(ew);
		return R.ok("查询宿舍人员调动成功").put("data", susherenyuandiaodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        SusherenyuandiaodongEntity susherenyuandiaodong = susherenyuandiaodongService.selectById(id);
        return R.ok().put("data", susherenyuandiaodong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        SusherenyuandiaodongEntity susherenyuandiaodong = susherenyuandiaodongService.selectById(id);
        return R.ok().put("data", susherenyuandiaodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SusherenyuandiaodongEntity susherenyuandiaodong, HttpServletRequest request){
    	susherenyuandiaodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susherenyuandiaodong);

        susherenyuandiaodongService.insert(susherenyuandiaodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SusherenyuandiaodongEntity susherenyuandiaodong, HttpServletRequest request){
    	susherenyuandiaodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susherenyuandiaodong);

        susherenyuandiaodongService.insert(susherenyuandiaodong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SusherenyuandiaodongEntity susherenyuandiaodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(susherenyuandiaodong);
        susherenyuandiaodongService.updateById(susherenyuandiaodong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        susherenyuandiaodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SusherenyuandiaodongEntity> wrapper = new EntityWrapper<SusherenyuandiaodongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("sushezhang")) {
			wrapper.eq("sushezhangzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = susherenyuandiaodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
