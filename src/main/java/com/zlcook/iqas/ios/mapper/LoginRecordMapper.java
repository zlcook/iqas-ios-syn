package com.zlcook.iqas.ios.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlcook.iqas.ios.bean.LoginRecord;

/**
* @author 周亮 
* @version 创建时间：2017年3月8日 下午9:38:36
* 
*/
@Mapper
public interface LoginRecordMapper {

	@Select("select * from login_record where id = #{id}")
	LoginRecord findByState(@Param("id") Integer id);
}
