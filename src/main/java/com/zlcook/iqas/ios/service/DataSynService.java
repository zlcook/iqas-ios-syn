package com.zlcook.iqas.ios.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.dto.SynMetaDTO;
import com.zlcook.iqas.ios.dto.SynTableData;
import com.zlcook.iqas.ios.dto.SynTableName;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:16:25
* 数据同步服务
*/
public interface DataSynService {
	
	/**
	 * 需要同步表对应实体类的名称
	 */
	public final static String SYN_USER="user";
	public final static String SYN_USERCARD="usercard";
	public final static String SYN_USERLEARNINGSTYLE="userlearningstyle";
	public final static String SYN_USERRESOURCE="userresource";
	public final static String SYN_USERTESTCOUNT="usertestcount";
	public final static String SYN_USERWORD="userword";

	/**
	 * 获取用户所有同步表元数据
	 * @param userId 用户id
	 * @return
	 * 同步表元数据集合
	 */
	List<DataSynRecord> listTableSynRecord(Integer userId);
	/**
	 * 根据用户账号初始化用户同步表元数据
	 * @param userId  用户id
	 */
	void init4User(Integer userId);
	/**
	 * 将serverTableMetas和mobileTableMetas中的名称表名称相同的实体进行比较，最终得到需要同步表。
	 * 表的同步方向类型：upsyntable:移动端->服务端；downsyntable:：服务端->移动端。
     * 表的同步方向取值规则：如果S.version>M.version 则取upsyntable，否则如果M.lastModifyTime>S.lastModifyTime 则取downsyntable:否则该表不进行同步
     *
	 * @param serverTableMetas 服务端用户的同步表元数据
	 * @param mobileTableMetas 移动端用户的同步表元数据
	 *@return 返回需要同步的结果
	 */
	SynMetaDTO getSynMeta(List<DataSynRecord> serverTableMetas, List<DataSynRecord> mobileTableMetas);
	/**
	 * 更某个用户数据表中的数据
	 * @param tableData 更新使用的数据
	 * @param userId 
	 * @return
	 * 更新成功返回true，否则返回false，方法具有事务性
	 */
	@Transactional
	boolean updateSynTable(SynTableData tableData,Integer userId);
	/**
	 * 根据表名称和用户id获取该用户在该表中的所有数据
	 * @param listTableName 表名称集合
	 * @param userId 用户id
	 * @return
	 * 返回listTableName中对应表在该用户下的所有数据
	 */
	SynTableData getTableData(List<SynTableName> listTableName,Integer userId);
}   
