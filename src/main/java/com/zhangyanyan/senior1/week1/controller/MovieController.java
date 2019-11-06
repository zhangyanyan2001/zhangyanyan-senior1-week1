package com.zhangyanyan.senior1.week1.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangyanyan.senior1.week1.domain.Movie;
import com.zhangyanyan.senior1.week1.service.MovieService;
import com.zhangyanyan.senior1.week1.util.PageUtil;
import com.zhangyanyan.senior1.week1.vo.MovieVo;

@Controller
public class MovieController {

	@Resource
	private MovieService service;
	/**
	 * 
	 * @Title: list 
	 * @Description: TODO
	 * @param request
	 * @param vo
	 * @param page
	 * @return
	 * @return: String
	 */
	@RequestMapping("list")
	public String list(HttpServletRequest request, MovieVo vo,@RequestParam(defaultValue = "1")int page
			) {
		
		int pageSize=3;
		
		PageHelper.startPage(page, pageSize);
		
		List<Movie> list = service.list(vo);
		
		PageInfo<Movie> info = new PageInfo<>(list);
		
		PageUtil.page(request, "/list", pageSize, info.getList(), (int) info.getTotal(), pageSize);
		
		request.setAttribute("info", info);
		request.setAttribute("list", list);
		
		return "list";
	}
	/**
	 * 
	 * @Title: del 
	 * @Description: TODO
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	@RequestMapping("del")
	public boolean del(String ids) {
		
		return service.del(ids);
	}
}
