package com.mio.wechat.common;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MediaFileTest {
	
	private static Logger logger = Logger.getLogger(MediaFileTest.class);
	private String uploadFile =  MediaFileTest.class.getResource("").getPath() + "weixin.jpg";
	private String downFile = MediaFileTest.class.getResource("").getPath() + "weixin_down.jpg";
	private String mediaId;
	
	/**
	 * 多媒体文件上传
	 */
	public void testUpload() {
		com.mio.wechat.common.MediaFile mediaFile = new com.mio.wechat.common.MediaFile();
		
		File file = new File(uploadFile);
		String result = mediaFile.upload(file, com.mio.wechat.common.MediaType.image);
		this.mediaId = result;
		
		assertTrue(result != null);
		logger.info("mediaFile upload result: " + result);
	}

	/**
	 * 多媒体文件下载
	 * @return
	 */
	public  byte[] testDownload() {
		com.mio.wechat.common.MediaFile mediaFile = new com.mio.wechat.common.MediaFile();
		byte[] b = mediaFile.download(mediaId);
		
		assertTrue(b != null);
		return b;
	}
	
	/**
	 * 多媒体文件上传下载测试套件
	 */
	@Test
	public void testSuite(){
		//上传得到mediaId
		testUpload();
		//根据mediaId下载刚才上传的文件
		byte[] b = testDownload();
		
		//下载的文件另存为
		File file = new File(downFile);
		FileOutputStream fStream = null;
		try {
			fStream = new FileOutputStream(file);
			fStream.write(b);
			fStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("文件下载成功，请去查看，路径" + downFile );
	}

}
