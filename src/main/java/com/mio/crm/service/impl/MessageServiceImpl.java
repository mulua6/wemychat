package com.mio.crm.service.impl;

import com.mio.crm.dao.MessageDao;
import com.mio.crm.service.MessageService;
import com.mio.wechat.request.WechatRequest;

/**
 * Created by hel2 on 11/1/16.
 */
public class MessageServiceImpl implements MessageService{

    private MessageDao messageDao;
    public void saveMessage(WechatRequest wechatRequest) {
        messageDao.saveMessage(wechatRequest);
    }


    public MessageDao getMessageDao() {
        return messageDao;
    }

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
}
