package com.zlcook.iqas.ios.form;

import java.util.List;

import com.zlcook.iqas.ios.bean.DataSynRecord;

/**
* @author 周亮 
* @version 创建时间：2017年3月8日 上午10:31:03
* 请求同步元数据的表单，用户在请求同步时会填写该表单中的相关内容，服务端用该类来接收服务端的数据。
* 
			{
			  "userId":11,
			  "tablemeta":[
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
	private List<DataSynRecord> tablemeta;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<DataSynRecord> getTablemeta() {
		return tablemeta;
	}

	public void setTablemeta(List<DataSynRecord> tablemeta) {
		this.tablemeta = tablemeta;
	}
	

}
