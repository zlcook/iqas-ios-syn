package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserCardMapper {
    int countByExample(UserCardExample example);

    int deleteByExample(UserCardExample example);

    int deleteByPrimaryKey(Integer usercardId);

    int insert(UserCard record);

    int insertSelective(UserCard record);

    List<UserCard> selectByExample(UserCardExample example);

    UserCard selectByPrimaryKey(Integer usercardId);

    int updateByExampleSelective(@Param("record") UserCard record, @Param("example") UserCardExample example);

    int updateByExample(@Param("record") UserCard record, @Param("example") UserCardExample example);

    int updateByPrimaryKeySelective(UserCard record);

    int updateByPrimaryKey(UserCard record);
 }