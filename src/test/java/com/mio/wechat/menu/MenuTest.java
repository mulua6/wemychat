package com.mio.wechat.menu;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信自定义菜单接口测试
 * @author Zhangxs
 * @version 2015-7-4
 */
public class MenuTest {
	private com.mio.wechat.menu.MenuManager manager;
	@Before
	public void init(){
		manager = new com.mio.wechat.menu.MenuManager();
	}
	/**
	 * 创建菜单
	 */
	@Test
	public void createMenu(){
		//单击按钮
		com.mio.wechat.menu.MenuButton btnClick= new com.mio.wechat.menu.MenuButton();
		btnClick.setName("单击按钮");
		btnClick.setType(com.mio.wechat.event.EventType.click);
		btnClick.setKey("单击按钮");
		//跳转URL
		com.mio.wechat.menu.MenuButton btnView= new com.mio.wechat.menu.MenuButton();
		btnView.setName("跳转URL");
		btnView.setType(com.mio.wechat.event.EventType.view);
		btnView.setUrl("http://www.baidu.com");
		//扫码推事件
		com.mio.wechat.menu.MenuButton btnScanCodePush= new com.mio.wechat.menu.MenuButton();
		btnScanCodePush.setName("扫码推事件");
		btnScanCodePush.setType(com.mio.wechat.event.EventType.scancode_push);
		btnScanCodePush.setKey("扫码推事件");
		//扫码带提示
		com.mio.wechat.menu.MenuButton btnScanCodeWaitMsg= new com.mio.wechat.menu.MenuButton();
		btnScanCodeWaitMsg.setName("扫码带提示");
		btnScanCodeWaitMsg.setType(com.mio.wechat.event.EventType.scancode_waitmsg);
		btnScanCodeWaitMsg.setKey("扫码带提示");
		
		//弹出系统拍照发图
		com.mio.wechat.menu.MenuButton btnPicSysPhoto= new com.mio.wechat.menu.MenuButton();
		btnPicSysPhoto.setName("拍照发图");
		btnPicSysPhoto.setType(com.mio.wechat.event.EventType.pic_sysphoto);
		btnPicSysPhoto.setKey("拍照发图");
		//弹出拍照或者相册发图
		com.mio.wechat.menu.MenuButton btnPicPhotoOrAlbum= new com.mio.wechat.menu.MenuButton();
		btnPicPhotoOrAlbum.setName("拍照/相册发图");
		btnPicPhotoOrAlbum.setType(com.mio.wechat.event.EventType.pic_photo_or_album);
		btnPicPhotoOrAlbum.setKey("拍照/相册发图");
		//弹出微信相册发图器
		com.mio.wechat.menu.MenuButton btnPicWeixin= new com.mio.wechat.menu.MenuButton();
		btnPicWeixin.setName("相册发图");
		btnPicWeixin.setType(com.mio.wechat.event.EventType.pic_weixin);
		btnPicWeixin.setKey("相册发图");
		//弹出地理位置选择器
		com.mio.wechat.menu.MenuButton btnLocationSelect= new com.mio.wechat.menu.MenuButton();
		btnLocationSelect.setName("地理位置");
		btnLocationSelect.setType(com.mio.wechat.event.EventType.location_select);
		btnLocationSelect.setKey("地理位置");
		
		//下发消息（除文本消息）
		btnLocationSelect.setType(com.mio.wechat.event.EventType.location_select);
		com.mio.wechat.menu.MenuButton btnMediaId  = new com.mio.wechat.menu.MenuButton();
		btnMediaId.setName("");
		btnMediaId.setType(com.mio.wechat.event.EventType.media_id);
		btnMediaId.setMediaId("");
		//跳转图文消息URL
		com.mio.wechat.menu.MenuButton btnViewLimited  = new com.mio.wechat.menu.MenuButton();
		btnViewLimited.setName("");
		btnViewLimited.setType(com.mio.wechat.event.EventType.view_limited);
		btnViewLimited.setMediaId("");
		
		List<com.mio.wechat.menu.MenuButton> subBut1 = new ArrayList<com.mio.wechat.menu.MenuButton>();
		subBut1.add(btnScanCodePush);
		subBut1.add(btnScanCodeWaitMsg);
		subBut1.add(btnPicSysPhoto);
		subBut1.add(btnPicPhotoOrAlbum);
		subBut1.add(btnPicWeixin);
		List<com.mio.wechat.menu.MenuButton> subBut2 = new ArrayList<com.mio.wechat.menu.MenuButton>();
		subBut2.add(btnClick);
		subBut2.add(btnView);
		//二级菜单
		com.mio.wechat.menu.MenuButton subButScanCode = new com.mio.wechat.menu.MenuButton();
		subButScanCode.setName("扫码");
		subButScanCode.setSubButton(subBut1);
		com.mio.wechat.menu.MenuButton sub1 = new com.mio.wechat.menu.MenuButton();
		sub1.setName("单击");
		sub1.setSubButton(subBut2);
		
		List<com.mio.wechat.menu.MenuButton> button = new ArrayList<com.mio.wechat.menu.MenuButton>();
		button.add(sub1);
		button.add(subButScanCode);
		button.add(btnLocationSelect);
		com.mio.wechat.menu.Menu menu = new com.mio.wechat.menu.Menu();
		menu.setButton(button);
		
		try {
			manager.create(menu);
			System.out.println("菜单创建成功");
		} catch (com.mio.wechat.exception.WeChatException e) {
			System.out.println("菜单创建失败");
			e.printStackTrace();
		}
	}
	/**
	 * 查询菜单
	 */
	@Test
	public void  getMenu(){
		com.mio.wechat.menu.Menu menu = manager.getMenu();
		System.out.println(menu.getButton().size());
	}
	/**
	 * 删除菜单
	 */
	@Test
	public void delete(){
		try {
			manager.delete();
			System.out.println("菜单删除成功");
		} catch (com.mio.wechat.exception.WeChatException e) {
			System.out.println("菜单删除失败");
			e.printStackTrace();
		}
	}
}
