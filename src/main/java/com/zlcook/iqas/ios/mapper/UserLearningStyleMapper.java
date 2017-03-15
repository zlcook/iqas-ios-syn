package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserLearningStyle;
import com.zlcook.iqas.ios.bean.UserLearningStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserLearningStyleMapper {
    int countByExample(UserLearningStyleExample example);

    int deleteByExample(UserLearningStyleExample example);

    int deleteByPrimaryKey(Integer userlearningstyleId);

    int insert(UserLearningStyle record);

    int insertSelective(UserLearningStyle record);

    List<UserLearningStyle> selectByExample(UserLearningStyleExample example);

    UserLearningStyle selectByPrimaryKey(Integer userlearningstyleId);

    int updateByExampleSelective(@Param("record") UserLearningStyle record, @Param("example") UserLearningStyleExample example);

    int updateByExample(@Param("record") UserLearningStyle record, @Param("example") UserLearningStyleExample example);

    int updateByPrimaryKeySelective(UserLearningStyle record);

    int updateByPrimaryKey(UserLearningStyle record);
    
}