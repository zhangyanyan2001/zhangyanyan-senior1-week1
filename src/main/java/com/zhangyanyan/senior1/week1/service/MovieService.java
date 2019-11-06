package com.zhangyanyan.senior1.week1.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangyanyan.senior1.week1.domain.Movie;
import com.zhangyanyan.senior1.week1.vo.MovieVo;

public interface MovieService {

/**
 * 
 * @Title: list 
 * @Description: TODO
 * @param vo
 * @return
 * @return: List<Movie>
 */
	List<Movie> list(MovieVo vo);
/**
 * 
 * @Title: del 
 * @Description: TODO
 * @param ids
 * @return
 * @return: boolean
 */
	boolean del(String ids);

}
