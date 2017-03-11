package com.zlcook.iqas.ios.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zlcook.iqas.ios.exception.GlobalExceptionHandler;
import com.zlcook.iqas.ios.unitl.GenericsUtils;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 上午11:10:34
* BaseDao接口的抽象实现类，该类通过反射技术实现了BaseDao接口的方法。
* AbstractBaseDao的子类必须是操作实体T的接口，且操作的实体T必须是由Mybatis经过逆向工程生成的类，他必须有配套的Mapeer接口，和Example类，其中Example必须和T在一个包下。
* 比如实体类User，是由mybatis经过逆向工程根据数据表user生成的实体类，其有对应的UserMapper接口，和UserExample类，其中UserExample和User在同一个包下。
*/
public abstract class AbstractBaseDao<M,T> implements BaseDao<T> {
	
	private static Logger logger = LoggerFactory.getLogger(AbstractBaseDao.class);
	/**
	 * 泛型M对应的Class对象
	 * M必须是实体T对应的Mapper类型接口，比如,T 为User,则M应该是UserMapper，UserMapper是通过Mybatis逆向工程得到的接口，这是一种约定。
	 */
	private Class<M> mapperClazz= GenericsUtils.getSuperClassGenricType(this.getClass());

	/**
	 * 泛型T对应的Class对象，对应的是实体类
	 */
	private Class<T> entityClazz= GenericsUtils.getSuperClassGenricType(this.getClass(),1);
	/**
	 * 实体类T对应的Example类，和T在一个包中，该类也是由mybatis逆向工程根据数据表生成的的实体类T的辅助类
	 */
	private Class entityExampleClazz ;
	/**
	 * 注入的实体的Mapper对象
	 */
	protected M  entityMapper;
	
	public AbstractBaseDao(M entityMapper) {
		super();
		this.entityMapper = entityMapper;
			String entityExampleName =entityClazz.getName()+"Example";
			try {
				entityExampleClazz = Class.forName(entityClazz.getName()+"Example");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				logger.error(entityClazz.getName()+"类对应的Example不存在", e);
			}
		
	}

	@Override
	public T getById(Integer id) {
		try {
			Method method =mapperClazz.getMethod("selectByPrimaryKey", Integer.class);
			return (T) method.invoke(entityMapper, id);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public <E> List<T> list(E example,Class<E> exampleClazz) {
		try {
			Method method = mapperClazz.getMethod("selectByExample",exampleClazz);//selectByExample
			List<T> list =(List<T>) method.invoke(entityMapper, example);
			if( list !=null )
				return list;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return new ArrayList<>();
	}
	@Override
	public List<T> list() {
		try {
			Method method = mapperClazz.getMethod("selectByExample",entityExampleClazz);//selectByExample
			List<T> list =(List<T>) method.invoke(entityMapper, entityExampleClazz.newInstance());
			if( list !=null )
				return list;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ArrayList<>();
	}

	@Override
	public int save(T entity) {
		try {
			Method method = mapperClazz.getMethod("insert",entityClazz );
			Integer affectCount= (Integer) method.invoke(entityMapper, entity);
			if( affectCount !=null )
				return affectCount;
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(T entity) {
		try {
			Method method = mapperClazz.getMethod("updateByPrimaryKey",entityClazz );
			Integer affectCount= (Integer) method.invoke(entityMapper, entity);
			if( affectCount !=null )
				return affectCount;
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int count() {
		//return userMapper.countByExample(null);
		try {
			Method method = mapperClazz.getMethod("countByExample",entityExampleClazz);
			Integer allSum= (Integer) method.invoke(entityMapper,entityExampleClazz.newInstance());
			if( allSum !=null )
				return allSum;
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
