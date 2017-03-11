package com.zlcook.iqas.ios.form;

import java.util.List;

import com.zlcook.iqas.ios.bean.DataSynRecord;

/**
* @author 周亮 
* @version 创建时间：2017年3月8日 上午10:31:03
* 用户在请求同步时会填写该实体类中的相关内容，服务端用该类来接收服务端的数据。
* 
			{
			  "userId":11,
			  "tableMeta":[
			  {
			  	  "synId":1,
			      "synTable":"user",
			      "userId": 11,
			      "version":0,
			      "lastModTime":0
			    },
			    {
			  	  "synId":1,
			      "synTable":"usercard",
			      "userId": 11,
			      "version":0,
			      "lastModTime":0
			    }
			    .....
			  ]
			}
*/
public class SynMetaJSON implements JsonObjectAssert{
	private Integer userId;
	/**
	 * 同步表元数据
	 */
	private List<DataSynRecord> tableMeta;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<DataSynRecord> getTableMeta() {
		return tableMeta;
	}

	public void setTableMeta(List<DataSynRecord> tableMeta) {
		this.tableMeta = tableMeta;
	}

}
