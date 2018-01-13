package yipianyun.user.service;

import java.util.List;
import java.util.Map;





import yipianyun.user.entity.User;
import yipianyun.user.exception.ServiceException;

/**
 * 用户表
 * @author 林
 *
 */
public interface UserService{
	

	/**
	 * 更新 user 不为空的字段
	 * @param user
	 */
	void modify(User user);
	
	/**
	 * 根据 id  删除 user
	 * @param id
	 */
	void delete(String id);

	/**
	 * 根据 封装的Map (userAccount， userPassword) 查询 单一 用户
	 * @param map
	 * @return
	 */
	User findUser(Map<String, Object> map);
	
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * 根据用户id查询用户信息
	 */
	User findOneUser(String id);
	

    //修改密码
	int modifyPsswordByAccount(User user) throws Exception;
	
	//重置密码
	int modifyResetPssword(String userId) throws Exception;
	
	/**
	 * 根据用户手机和用户名查询
	 */
	User findUserByPhoneAndUserCode(String account,String phoneNumber);
	/**
	 * 根据忘记密码后重置的密码
	 */
	int modifyUserPassword(Map<String, String> map)throws Exception;
	/**
	 * 注销用户session
	 * @throws ServiceException
	 */
	 void invalidateSession(String userid,Map<String, Object> userMap)throws ServiceException;
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 * @throws Exception 
	 * @throws UserOperateException 
	 */
	 boolean  registerUser(User user);
	 /**
	  * 判断账号是否存在
	  * @param account
	  * @return
	  */
	 boolean isExistAccount(String account);
		/**
		 * 根据用户账号查询
		 * @param account
		 * @return
		 */
		User selectUserByAccount(String account);
	 
}