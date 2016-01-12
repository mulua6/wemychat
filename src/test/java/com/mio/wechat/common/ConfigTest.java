package com.mio.wechat.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigTest {

	@Test
	public void testInstance() {
		com.mio.wechat.common.Config c = com.mio.wechat.common.Config.instance();
		String appid = c.getAppid();
	}

}
