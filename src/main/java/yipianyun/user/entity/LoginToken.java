package yipianyun.user.entity;




/**
 * 用户登录表
 * @author CaoJianJian
 * @date 2015/08/14
 */
public class LoginToken extends Entity{

	private static final long serialVersionUID = 1L;

	private String id;
	//登录时间
    private Long loginTime;
    //登录ip
    private String loginIp;
    //登录sessionID
    private String sessionid;
    //用户id
    private String userId;
    //保留字段
    private String tokenid;
    //保留字段
    private String instplanId;

    private String creator;

    private Long createtime;

    private String modifier;

    private Long modifytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    public String getInstplanId() {
        return instplanId;
    }

    public void setInstplanId(String instplanId) {
        this.instplanId = instplanId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Long getModifytime() {
        return modifytime;
    }

    public void setModifytime(Long modifytime) {
        this.modifytime = modifytime;
    }
}