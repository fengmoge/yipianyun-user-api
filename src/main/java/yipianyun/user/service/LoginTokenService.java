package yipianyun.user.service;


import java.util.List;
import java.util.Map;

import yipianyun.user.base.BaseService;
import yipianyun.user.entity.LoginToken;





/**
 * 用户登录表Service
 * @author CaoJianJian
 * @date 2015/08/14
 */
public interface LoginTokenService extends BaseService<LoginToken> {
	/**
	 * 通过sessionId删除LoginToken
	 * @param map
	 * @return
	 */
	public int deleteWithMap(Map<String, String> map);
	/**
     * 查询当前在线人数
     * @return 在线人数
     */
    int queryOnlineNum();
    /**
     * 根据userids查询其中在线的user
     */
    List<String> queryByUserIds(String userids);
    /**
     * 项目启动和关闭时清空logintoken表
     */
    public void deleteEmptyTable();
    
	/**
	 * 删除对象
	 * @param id
	 * @return
	 */
	public int deleteByUser(String id);

}
