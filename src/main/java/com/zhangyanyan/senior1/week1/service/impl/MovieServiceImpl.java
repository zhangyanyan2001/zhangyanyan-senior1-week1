package com.zhangyanyan.senior1.week1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.zhangyanyan.senior1.week1.dao.MovieMapper;
import com.zhangyanyan.senior1.week1.domain.Movie;
import com.zhangyanyan.senior1.week1.service.MovieService;
import com.zhangyanyan.senior1.week1.vo.MovieVo;
@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieMapper mapper;

	@Override
	public List<Movie> list(MovieVo vo) {
		// TODO Auto-generated method stub
		return mapper.list(vo);
	}

	@Override
	public boolean del(String ids) {
		// TODO Auto-generated method stub
		try {
			mapper.del(ids);
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
		
	}
	
}
