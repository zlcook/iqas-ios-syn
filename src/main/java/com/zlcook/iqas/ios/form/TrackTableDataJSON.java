package com.zlcook.iqas.ios.form;

import com.zlcook.iqas.ios.dto.TrackTableData;

/**
* @author 周亮 
* @version 创建时间：2017年3月15日 下午8:33:38
* 接收各个轨迹记录表的数据
* 
*/
public class TrackTableDataJSON  implements JsonObjectAssert {
	/**
	 * 同步表数据：移动端传给服务端的数据     
	 */
	private TrackTableData trackData;

	public TrackTableData getTrackData() {
		return trackData;
	}

	public void setTrackData(TrackTableData trackData) {
		this.trackData = trackData;
	}
	
}
