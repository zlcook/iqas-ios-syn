package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.bean.UserTestCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTestCountMapper {
    int countByExample(UserTestCountExample example);

    int deleteByExample(UserTestCountExample example);

    int deleteByPrimaryKey(Integer usertestcountId);

    int insert(UserTestCount record);

    int insertSelective(UserTestCount record);

    List<UserTestCount> selectByExample(UserTestCountExample example);

    UserTestCount selectByPrimaryKey(Integer usertestcountId);

    int updateByExampleSelective(@Param("record") UserTestCount record, @Param("example") UserTestCountExample example);

    int updateByExample(@Param("record") UserTestCount record, @Param("example") UserTestCountExample example);

    int updateByPrimaryKeySelective(UserTestCount record);

    int updateByPrimaryKey(UserTestCount record);
}