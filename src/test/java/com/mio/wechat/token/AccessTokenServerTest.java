/**
 * 
 */
package com.mio.wechat.token;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.sword.lang.HttpUtils;

/**
 * @author ChengNing
 * @date   2015年1月30日
 */
public class AccessTokenServerTest {

	private static Logger logger = Logger.getLogger(AccessTokenServerTest.class);
	@Test
	public void test(){
		com.mio.wechat.token.server.AccessTokenServer accessTokenServer = new com.mio.wechat.token.server.AccessTokenServer();
		accessTokenServer.defaultServer();
	}
	
	@Test
	public void testGet(){
		try {
			String result = HttpUtils.get("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx925a77489e94a7e6&secret=d29ae7a0b55d2f8570107d90985034dc");
			logger.info(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
