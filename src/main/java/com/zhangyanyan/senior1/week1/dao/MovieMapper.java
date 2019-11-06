package com.zhangyanyan.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.zhangyanyan.senior1.week1.domain.Movie;
import com.zhangyanyan.senior1.week1.vo.MovieVo;

public interface MovieMapper {
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
 * @return: void
 */
	void del(@Param("ids")String ids);

}
