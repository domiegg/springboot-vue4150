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


import com.dao.DiscussmeishirizhiDao;
import com.entity.DiscussmeishirizhiEntity;
import com.service.DiscussmeishirizhiService;
import com.entity.vo.DiscussmeishirizhiVO;
import com.entity.view.DiscussmeishirizhiView;

@Service("discussmeishirizhiService")
public class DiscussmeishirizhiServiceImpl extends ServiceImpl<DiscussmeishirizhiDao, DiscussmeishirizhiEntity> implements DiscussmeishirizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishirizhiEntity> page = this.selectPage(
                new Query<DiscussmeishirizhiEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishirizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishirizhiEntity> wrapper) {
		  Page<DiscussmeishirizhiView> page =new Query<DiscussmeishirizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishirizhiVO> selectListVO(Wrapper<DiscussmeishirizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishirizhiVO selectVO(Wrapper<DiscussmeishirizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishirizhiView> selectListView(Wrapper<DiscussmeishirizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishirizhiView selectView(Wrapper<DiscussmeishirizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
