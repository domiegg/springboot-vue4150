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


import com.dao.DiscussshicaixinxiDao;
import com.entity.DiscussshicaixinxiEntity;
import com.service.DiscussshicaixinxiService;
import com.entity.vo.DiscussshicaixinxiVO;
import com.entity.view.DiscussshicaixinxiView;

@Service("discussshicaixinxiService")
public class DiscussshicaixinxiServiceImpl extends ServiceImpl<DiscussshicaixinxiDao, DiscussshicaixinxiEntity> implements DiscussshicaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshicaixinxiEntity> page = this.selectPage(
                new Query<DiscussshicaixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshicaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshicaixinxiEntity> wrapper) {
		  Page<DiscussshicaixinxiView> page =new Query<DiscussshicaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshicaixinxiVO> selectListVO(Wrapper<DiscussshicaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshicaixinxiVO selectVO(Wrapper<DiscussshicaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshicaixinxiView> selectListView(Wrapper<DiscussshicaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshicaixinxiView selectView(Wrapper<DiscussshicaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
