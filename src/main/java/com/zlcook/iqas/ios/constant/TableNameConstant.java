package com.zlcook.iqas.ios.constant;
/**
* @author 周亮 
* @version 创建时间：2017年3月16日 上午10:25:28
* 声明同步实体类对外访问的名称。
*/
public class TableNameConstant {

	/**
	 * 用户表名称，一个用户只会对应一条数据
	 */
	public final static String SYN_USER="user";
	/**
	 * 用户卡表名称，一个用户只会对应一条数据
	 */
	public final static String SYN_USERCARD="Usercard";
	/**
	 * 学习风格表名称，一个用户只会对应一条数据
	 */
	public final static String SYN_USERLEARNINGSTYLE="Userlearningstyle";
	/**
	 * 用户测试统计表名称，一个用户只会对应一条数据
	 */
	public final static String SYN_USER_TEST_COUNT="usertestcount";
	/**
	 * 用户资源表名称，一个用户会对应多条数据，且每次同步有可能会有新加的数据，也有可能会在原来数据上修改
	 */
	public final static String SYN_USERRESOURCE="userresource";
	/**
	 * 用户测试表名称，一个用户会对应多条数据，且每次同步有可能会有新加的数据，也有可能会在原来数据上修改
	 */
	public final static String SYN_USERTEST="usertest";
	/**
	 * 用户学习单词表名称，一个用户会对应多条数据，且每次同步有可能会有新加的数据，也有可能会在原来数据上修改
	 */
	public final static String SYN_USERWORD="userword";

}
