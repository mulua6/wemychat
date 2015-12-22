package com.mio.wechat.user;

import org.junit.Before;
import org.junit.Test;

/**
 * 账号管理接口测试
 * @author Zhangxs
 * @version 2015-7-5
 */
public class AccountTest {
	private com.mio.wechat.user.AccountManager accountManager;
	@Before
	public void init(){
		accountManager = new com.mio.wechat.user.AccountManager();
	}
	/**
	 * 创建临时二维码
	 */
	@Test
	public void createQrcodeTemporary(){
		long sceneId =100;
		int expireSeconds = 1860;
		com.mio.wechat.user.Qrcode qrcode= accountManager.createQrcodeTemporary(sceneId, expireSeconds);
		System.out.println("二维码有效时间:"+qrcode.getExpireSeconds());
		System.out.println("二维码Ticket:"+qrcode.getTicket());
		System.out.println("二维码图片解析后的地址:"+qrcode.getUrl());
	}
	/**
	 * 创建永久二维码
	 */
	@Test
	public void createQrcodePerpetualstr(){
		String sceneStr = "wtb";
		com.mio.wechat.user.Qrcode qrcode = accountManager.createQrcodePerpetualstr(sceneStr);
		System.out.println("二维码Ticket:"+qrcode.getTicket());
		System.out.println("二维码图片解析后的地址:"+qrcode.getUrl());
	}
	/**
	 * 创建永久二维码
	 */
	@Test
	public void createQrcodePerpetual(){
		int sceneId = 123;
		com.mio.wechat.user.Qrcode qrcode = accountManager.createQrcodePerpetual(sceneId);
		System.out.println("二维码Ticket:"+qrcode.getTicket());
		System.out.println("二维码图片解析后的地址:"+qrcode.getUrl());
		
	}
	/**
	 * 长链接转短链接接口
	 */
	@Test
	public void shortUrl(){
		String longUrl="https://github.com/Zhangys-hh/wechat4j";
		String shortUrl = accountManager.shortUrl(longUrl);
		System.out.println("转换后的Url:"+shortUrl);
	}
	/**
	 * 获取二维码图片
	 */
	@Test
	public void getQrcode(){
		String ticket="gQHE7zoAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL1RVd1BodWpsQkJSOUdGeW5JMkp6AAIEZUaZVQMERAcAAA==";
		String qrcodeFile="D://qrcode.png";
		com.mio.wechat.user.AccountManager.getQrcode(ticket, qrcodeFile);
	}
	
}
