package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserBehaviour;
import com.zlcook.iqas.ios.bean.UserBehaviourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBehaviourMapper {
    int countByExample(UserBehaviourExample example);

    int deleteByExample(UserBehaviourExample example);

    int deleteByPrimaryKey(Integer userBehaviourId);

    int insert(UserBehaviour record);

    int insertSelective(UserBehaviour record);

    List<UserBehaviour> selectByExample(UserBehaviourExample example);

    UserBehaviour selectByPrimaryKey(Integer userBehaviourId);

    int updateByExampleSelective(@Param("record") UserBehaviour record, @Param("example") UserBehaviourExample example);

    int updateByExample(@Param("record") UserBehaviour record, @Param("example") UserBehaviourExample example);

    int updateByPrimaryKeySelective(UserBehaviour record);

    int updateByPrimaryKey(UserBehaviour record);
}