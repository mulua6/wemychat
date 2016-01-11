package com.mio.crm.dao;

import com.mio.wechat.request.WechatRequest;

/**
 * Created by hel2 on 11/1/16.
 */
public interface MessageDao {
    void saveMessage(WechatRequest wechatRequest);
}
