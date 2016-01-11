package com.mio.crm.dao.impl;

import com.mio.crm.dao.MessageDao;
import com.mio.wechat.request.WechatRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hel2 on 11/1/16.
 */
public class MessageDaoImpl implements MessageDao{
    @Autowired
    private SessionFactory sessionFactory;

    public void saveMessage(WechatRequest wechatRequest) {
        final Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(wechatRequest);
    }
}
