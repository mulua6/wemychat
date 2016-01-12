package com.mio.wechat.token;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenProxyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
//	@Test
//	public void tokenTest(){
//		String accessToken = TokenProxy.accessToken();
//		System.out.println(accessToken);
//		
//	}
	
	@Test
	public void jsApiTicketTest(){
		String jsApiTicket = com.mio.wechat.token.TokenProxy.jsApiTicket();
		System.out.println(jsApiTicket);
	}

}
