package com.zlcook.iqas.ios.dto;

import java.util.ArrayList;
import java.util.List;


/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午4:33:53
* 同步元数据，移动端请求同步时，服务端将移动端用户同步表的元数据表和服务器端该用户的元数据表比较，得出这一次同步的元数据。
*/
public class SynMetaDTO {
	
	/**
	 * upSynTable:移动端->服务端，移动端需要上传的数据表的名称集合：通过比较得出，移动端拥有该数据表的最新数据，所以要上传到服务端。
	 */
	private List<SynTableName> upSynTable;
	/**
	 * downSynTable:：服务端->移动端，移动端需要接收的数据表的名称集合：通过比较得出，服务端拥有该数据表的最新数据，所以移动端需要接收最新的数据。
	 */
	private List<SynTableName> downSynTable;
	
	public SynMetaDTO() {
		super();
		upSynTable=new ArrayList<>();
		downSynTable=new ArrayList<>();
	}
	public List<SynTableName> getUpSynTable() {
		return upSynTable;
	}
	public List<SynTableName> getDownSynTable() {
		return downSynTable;
	}

	public void putDownSynTableName(String tableName){
		downSynTable.add(new SynTableName(tableName));
	}

	public void putUpSynTableName(String tableName){
		upSynTable.add(new SynTableName(tableName));
	}
	
	
}
