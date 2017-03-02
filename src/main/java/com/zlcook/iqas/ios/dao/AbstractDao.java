package com.zlcook.iqas.ios.dao;

import java.util.List;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午7:19:07
* 数据持久层接口
* 该接口定义了Dao层接口常见的方法，为此如果一个Dao接口想要定义这些方法，可以直接继承该方法，泛型T代表的是Dao操作的实体了
*/
public interface AbstractDao<T> {
	
	/**
	 * 通过T的id进行查找，找不到返回null,方法不会对参数进行校验
	 * @param id 用于查找的id
	 * @return
	 * 返回查找到的T,否则返回null
	 */
	public T getById(Integer id);
	/**
	 * 返回T集合，结果不为null
	 * @return
	 */
	public List<T> list();
	/**
	 * 保存entity实体,并返回返回受影响记录条数
	 * @param entity 要保存的实体对象
	 * @return  返回受影响记录条数
	 */
	public int save(T entity);
	
	/**
	 * 更新实体,实体的id必须要存在
	 * @param entity 实体id
	 * @return 
	 * 返回受影响记录条数
	 */
	public int update(T entity);
	
	/**
	 * 获取记录总数
	 * @return
	 */
	public long count();
	
}
