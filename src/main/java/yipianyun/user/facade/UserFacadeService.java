package yipianyun.user.facade;

import java.util.Map;

import yipianyun.user.entity.User;
import yipianyun.user.exception.ServiceException;


public interface UserFacadeService {
	/**
	 * 更新 user 不为空的字段
	 * @param user
	 */
	void modify(User user);
	/**
	 * 根据 封装的Map (userAccount， userPassword) 查询 单一 用户
	 * @param map
	 * @return
	 */
	User findUser(Map<String, Object> map);
	/**
	 * 注销用户session
	 * @throws ServiceException
	 */
	 void invalidateSession(String userid,Map<String, Object> map)throws ServiceException;
}
