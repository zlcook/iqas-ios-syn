package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserResource;
import com.zlcook.iqas.ios.bean.UserResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceMapper {
    int countByExample(UserResourceExample example);

    int deleteByExample(UserResourceExample example);

    int deleteByPrimaryKey(Integer userResourceId);

    int insert(UserResource record);

    int insertSelective(UserResource record);

    List<UserResource> selectByExample(UserResourceExample example);

    UserResource selectByPrimaryKey(Integer userResourceId);

    int updateByExampleSelective(@Param("record") UserResource record, @Param("example") UserResourceExample example);

    int updateByExample(@Param("record") UserResource record, @Param("example") UserResourceExample example);

    int updateByPrimaryKeySelective(UserResource record);

    int updateByPrimaryKey(UserResource record);
}