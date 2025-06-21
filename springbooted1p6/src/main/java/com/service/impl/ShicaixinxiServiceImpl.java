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


import com.dao.ShicaixinxiDao;
import com.entity.ShicaixinxiEntity;
import com.service.ShicaixinxiService;
import com.entity.vo.ShicaixinxiVO;
import com.entity.view.ShicaixinxiView;

@Service("shicaixinxiService")
public class ShicaixinxiServiceImpl extends ServiceImpl<ShicaixinxiDao, ShicaixinxiEntity> implements ShicaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShicaixinxiEntity> page = this.selectPage(
                new Query<ShicaixinxiEntity>(params).getPage(),
                new EntityWrapper<ShicaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShicaixinxiEntity> wrapper) {
		  Page<ShicaixinxiView> page =new Query<ShicaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShicaixinxiVO> selectListVO(Wrapper<ShicaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShicaixinxiVO selectVO(Wrapper<ShicaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShicaixinxiView> selectListView(Wrapper<ShicaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShicaixinxiView selectView(Wrapper<ShicaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
