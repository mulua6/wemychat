package com.mio.crm.dao;

import com.mio.crm.service.MessageService;

/**
 * Created by liuhe on 15/12/24.
 * update
 */
public class TestDao {
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
