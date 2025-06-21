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


import com.dao.DiscussjiankangwenzhangDao;
import com.entity.DiscussjiankangwenzhangEntity;
import com.service.DiscussjiankangwenzhangService;
import com.entity.vo.DiscussjiankangwenzhangVO;
import com.entity.view.DiscussjiankangwenzhangView;

@Service("discussjiankangwenzhangService")
public class DiscussjiankangwenzhangServiceImpl extends ServiceImpl<DiscussjiankangwenzhangDao, DiscussjiankangwenzhangEntity> implements DiscussjiankangwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangwenzhangEntity> page = this.selectPage(
                new Query<DiscussjiankangwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangwenzhangEntity> wrapper) {
		  Page<DiscussjiankangwenzhangView> page =new Query<DiscussjiankangwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangwenzhangVO> selectListVO(Wrapper<DiscussjiankangwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangwenzhangVO selectVO(Wrapper<DiscussjiankangwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangwenzhangView> selectListView(Wrapper<DiscussjiankangwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangwenzhangView selectView(Wrapper<DiscussjiankangwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
