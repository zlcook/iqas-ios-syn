package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.bean.SynStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SynStateMapper {
    int countByExample(SynStateExample example);

    int deleteByExample(SynStateExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SynState record);

    int insertSelective(SynState record);

    List<SynState> selectByExample(SynStateExample example);

    SynState selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SynState record, @Param("example") SynStateExample example);

    int updateByExample(@Param("record") SynState record, @Param("example") SynStateExample example);

    int updateByPrimaryKeySelective(SynState record);

    int updateByPrimaryKey(SynState record);
}