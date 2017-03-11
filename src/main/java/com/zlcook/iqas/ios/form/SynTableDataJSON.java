package com.zlcook.iqas.ios.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.zlcook.iqas.ios.dto.SynTableData;
import com.zlcook.iqas.ios.dto.SynTableName;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 上午8:52:35
* 接收移动端同步数据：指在用户请求完同步元数据后，根据同步元数据，生成的需要上传的数据以及告诉服务端需要下传给移动的数据。
* 该实体类就是用于接收同步数据使用的。移动端以json格式将数据传输过来，最后会将json数据转换为该类的实体对象。
* 传过来的json数据格式如下：
*      {
	    "userId":11,
		"downSynTable":[ { "synTable":"userCard"},...],    //向下同步的同步表名称：服务端需要下传的数据表     
		"tableData":{                                       //移动端传给服务端的数据               
			"user":[{"userId":1,"loginName":"liang","grade":4,"leavel":1,...},...],//用户表的同步数据
			"userCord":[{}],  
			"userLearningStyle":[{}],
			"userResource":[{}],
			"userTestCount":[{}],
			"userWord":[{}]
		  }
		}
*/
public class SynTableDataJSON implements JsonObjectAssert {

	@NotNull
	private Integer userId;
	/**
	 * 向下同步的同步表名称：服务端需要下传的数据表
	 */
	private List<SynTableName> downSynTable;
	/**
	 * 同步表数据：移动端传给服务端的数据     
	 */
	private SynTableData tableData;
	
	public Integer getUserId() {
		return userId;
	}
	
	public List<SynTableName> getDownSynTable() {
		return downSynTable;
	}

	public void setDownSynTable(List<SynTableName> downSynTable) {
		this.downSynTable = downSynTable;
	}

	public SynTableData getTableData() {
		return tableData;
	}
	public void setTableData(SynTableData tableData) {
		this.tableData = tableData;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
