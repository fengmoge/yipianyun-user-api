package yipianyun.user.service;

import java.io.IOException;
/** 
 * 进行des加密 
 * 作者：刘超
 * 创建时间：2015年8月20日上午10:52:25
 */ 
public interface EncryptionService {
   /**
     * Description 根据键值进行加密
     * @param data 
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
	 public  String encrypt(String data, String key) throws Exception;
	 
	   /**
	     * Description 根据键值进行解密
	     * @param data
	     * @param key  加密键byte数组
	     * @return
	     * @throws IOException
	     * @throws Exception
	     */  
	 public  String decrypt(String data, String key) throws IOException,Exception;
	
}
