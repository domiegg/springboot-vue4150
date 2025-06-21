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


import com.dao.JiankangwenzhangDao;
import com.entity.JiankangwenzhangEntity;
import com.service.JiankangwenzhangService;
import com.entity.vo.JiankangwenzhangVO;
import com.entity.view.JiankangwenzhangView;

@Service("jiankangwenzhangService")
public class JiankangwenzhangServiceImpl extends ServiceImpl<JiankangwenzhangDao, JiankangwenzhangEntity> implements JiankangwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangwenzhangEntity> page = this.selectPage(
                new Query<JiankangwenzhangEntity>(params).getPage(),
                new EntityWrapper<JiankangwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangwenzhangEntity> wrapper) {
		  Page<JiankangwenzhangView> page =new Query<JiankangwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangwenzhangVO> selectListVO(Wrapper<JiankangwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangwenzhangVO selectVO(Wrapper<JiankangwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangwenzhangView> selectListView(Wrapper<JiankangwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangwenzhangView selectView(Wrapper<JiankangwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
