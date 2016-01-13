package com.mio.crm.service;

import com.mio.wechat.request.WechatRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hel2 on 11/1/16.
 */
@Service
public interface MessageService {
    void saveMessage(WechatRequest wechatRequest);
    void say();
}
