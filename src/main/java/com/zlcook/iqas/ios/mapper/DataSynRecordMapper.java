package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSynRecordMapper {
    int countByExample(DataSynRecordExample example);

    int deleteByExample(DataSynRecordExample example);

    int deleteByPrimaryKey(Integer synId);

    int insert(DataSynRecord record);

    int insertSelective(DataSynRecord record);

    List<DataSynRecord> selectByExample(DataSynRecordExample example);

    DataSynRecord selectByPrimaryKey(Integer synId);

    int updateByExampleSelective(@Param("record") DataSynRecord record, @Param("example") DataSynRecordExample example);

    int updateByExample(@Param("record") DataSynRecord record, @Param("example") DataSynRecordExample example);

    int updateByPrimaryKeySelective(DataSynRecord record);

    int updateByPrimaryKey(DataSynRecord record);
}