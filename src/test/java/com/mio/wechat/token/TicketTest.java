package com.mio.wechat.token;

import org.junit.Test;

public class TicketTest {
	
	@Test
	public void test(){
		String jsapiTicket = com.mio.wechat.token.TokenProxy.jsApiTicket();
		String expi = "";
		System.out.println(jsapiTicket);
	}

}
