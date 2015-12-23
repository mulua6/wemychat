package com.mio.crm.controller;

import com.mio.wechat.WechatSupport;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hel2 on 23/12/15.
 */
public class LifeDonut extends WechatSupport{

    /**
     * 构建微信处理
     *
     * @param request 微信服务发过来的http请求
     */
    public LifeDonut(HttpServletRequest request) {
        super(request);
    }

    @Override
    protected void onText() {
        this.wechatRequest.getFromUserName();
        String content = "test ok";
        responseText(content);
    }

    @Override
    protected void onImage() {

    }

    @Override
    protected void onVoice() {

    }

    @Override
    protected void onVideo() {

    }

    @Override
    protected void onShortVideo() {

    }

    @Override
    protected void onLocation() {

    }

    @Override
    protected void onLink() {

    }

    @Override
    protected void onUnknown() {

    }

    @Override
    protected void click() {

    }

    @Override
    protected void subscribe() {

    }

    @Override
    protected void unSubscribe() {

    }

    @Override
    protected void scan() {

    }

    @Override
    protected void location() {

    }

    @Override
    protected void view() {

    }

    @Override
    protected void templateMsgCallback() {

    }

    @Override
    protected void scanCodePush() {

    }

    @Override
    protected void scanCodeWaitMsg() {

    }

    @Override
    protected void picSysPhoto() {

    }

    @Override
    protected void picPhotoOrAlbum() {

    }

    @Override
    protected void picWeixin() {

    }

    @Override
    protected void locationSelect() {

    }

    @Override
    protected void kfCreateSession() {

    }

    @Override
    protected void kfCloseSession() {

    }

    @Override
    protected void kfSwitchSession() {

    }
}
