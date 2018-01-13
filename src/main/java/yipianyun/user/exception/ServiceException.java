package yipianyun.user.exception;
/**
 * @author limingf
 *
 * 2015年9月10日 下午12:32:21
 */
public class ServiceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(Throwable e){
		super(e);
	}
	
	public ServiceException(String msg){
		super(msg);
	}
	
	public ServiceException(Throwable e,String msg){
		super(msg,e);
	}
}
