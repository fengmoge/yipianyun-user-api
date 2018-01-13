package yipianyun.user.base;

import java.util.List;
import java.util.Map;


public interface BaseService<T> {

	/**
	 * 保存对象
	 * @param t
	 * @return
	 * @throws Exception 
	 */
	public String save(T t) throws Exception;

	/**
	 * 更新对象
	 * @param t
	 * @return
	 * @throws Exception 
	 */
	public int modify(T t) throws Exception;

	/**
	 * 删除对象
	 * @param id
	 * @return
	 */
	public int delete(String id);

	/**
	 * 批量删除对象
	 * @param id
	 * @return
	 */
	public int delete(String[] id);

	/**
	 * 获取对象
	 * @param id
	 * @return
	 */
	public T get(String id);

	/**
	 * 查询单个对象
	 * @param id
	 * @return
	 */
	public T findOne(Map<? extends Object, ? extends Object> map);
	
	/**
	 * 列出全部对象
	 * @return
	 */
	public List<T> findAll();
	
	/**
	 * 列出全部对象并分页显示
	 * @param start
	 * @param length
	 * @return
	 */
	public List<T> findWithPaging(int start, int length);
	
	/**
	 * 查询对象
	 * @param map
	 * @return
	 */
	public List<T> find(Map<? extends Object, ? extends Object> map);
	
	/**
	 * 查询对象并分页显示
	 * @param map
	 * @param start
	 * @param length
	 * @return
	 */
	public List<T> findWithPaging(Map<Object, Object> map, int start, int length);
}
