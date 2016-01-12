package com.mio.wechat.token;


import org.junit.Test;

public class AccessTokenTest {

	@Test
	public void testRequest() {
		com.mio.wechat.token.AccessToken accessToken = new com.mio.wechat.token.AccessToken();
		accessToken.request();
		String result = accessToken.getToken();
	}

}
