package com.zlcook.iqas.ios.vo;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.dto.SynTableData;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:28:38
* 同步表数据和同步表元数据封装实体类。
* {
		"tableMeta":[{"synId":1,"synTable":"user","userId": 11,"version":0,"lastModTime":0},.....],//同步表元数据
		"tableData":{                                                 
			"user":[{"userId":1,"loginName":"liang","grade":4,"leavel":1,...},...],//同步表数据
			"usercord":[{}],  
			"userlearningstyle":[{}],
			"userresource":[{}],
			"usertestcount":[{}],
			"userword":[{}]
		  }
	}
*/
public class SynTableDataVO {

	/**
	 * 同步表元数据
	 */
	private List<DataSynRecord> tableMeta;
	/**
	 * 同步表数据
	 */
	private  SynTableData tableData;
	
	public SynTableDataVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SynTableDataVO(List<DataSynRecord> tableMeta, SynTableData tableData) {
		super();
		this.tableMeta = tableMeta;
		this.tableData = tableData;
	}
	public List<DataSynRecord> getTableMeta() {
		return tableMeta;
	}
	public void setTableMeta(List<DataSynRecord> tableMeta) {
		this.tableMeta = tableMeta;
	}
	public SynTableData getTableData() {
		return tableData;
	}
	public void setTableData(SynTableData tableData) {
		this.tableData = tableData;
	}
    
}
