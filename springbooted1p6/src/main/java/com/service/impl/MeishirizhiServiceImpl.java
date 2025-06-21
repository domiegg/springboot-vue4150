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


import com.dao.MeishirizhiDao;
import com.entity.MeishirizhiEntity;
import com.service.MeishirizhiService;
import com.entity.vo.MeishirizhiVO;
import com.entity.view.MeishirizhiView;

@Service("meishirizhiService")
public class MeishirizhiServiceImpl extends ServiceImpl<MeishirizhiDao, MeishirizhiEntity> implements MeishirizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishirizhiEntity> page = this.selectPage(
                new Query<MeishirizhiEntity>(params).getPage(),
                new EntityWrapper<MeishirizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishirizhiEntity> wrapper) {
		  Page<MeishirizhiView> page =new Query<MeishirizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishirizhiVO> selectListVO(Wrapper<MeishirizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishirizhiVO selectVO(Wrapper<MeishirizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishirizhiView> selectListView(Wrapper<MeishirizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishirizhiView selectView(Wrapper<MeishirizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
