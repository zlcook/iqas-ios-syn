package com.zlcook.iqas.ios.mapper;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

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
    
    @Update("update data_syn_record  set  `version` = ( `version` +1) ,last_mod_time = #{lastModTime}  where user_id=#{userId} and syn_table=#{tableName}")
    void updateSynTableMetaVersion(@Param("userId") Integer userId, @Param("tableName") String tableName,@Param("lastModTime") Long lastModTime);

}