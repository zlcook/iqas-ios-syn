package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserTest;
import com.zlcook.iqas.ios.bean.UserTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTestMapper {
    int countByExample(UserTestExample example);

    int deleteByExample(UserTestExample example);

    int deleteByPrimaryKey(Integer usertestId);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    List<UserTest> selectByExample(UserTestExample example);

    UserTest selectByPrimaryKey(Integer usertestId);

    int updateByExampleSelective(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByExample(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}