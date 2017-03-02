package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.UserWord;
import com.zlcook.iqas.ios.bean.UserWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWordMapper {
    int countByExample(UserWordExample example);

    int deleteByExample(UserWordExample example);

    int deleteByPrimaryKey(Integer userWordId);

    int insert(UserWord record);

    int insertSelective(UserWord record);

    List<UserWord> selectByExample(UserWordExample example);

    UserWord selectByPrimaryKey(Integer userWordId);

    int updateByExampleSelective(@Param("record") UserWord record, @Param("example") UserWordExample example);

    int updateByExample(@Param("record") UserWord record, @Param("example") UserWordExample example);

    int updateByPrimaryKeySelective(UserWord record);

    int updateByPrimaryKey(UserWord record);
}