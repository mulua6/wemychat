/**
 * 
 */
package com.mio.wechat.token.server;

import com.mio.wechat.common.Config;


/**
 * Ticket server适配器
 * @author ChengNing
 * @date   2015年1月29日
 */
public class JsApiTicketServer extends AbsServer implements TicketServer  {


	/**
	 * 
	 */
	public String ticket() {
		return super.token();
	}

	/**
	 * 
	 */
	@Override
	protected String getCustomerServerClass() {
		return Config.instance().getJsApiTicketServer();
	}

	/**
	 * 
	 */
	@Override
	public IServer defaultServer() {
		return JsApiTicketMemServer.instance();
	}

}
