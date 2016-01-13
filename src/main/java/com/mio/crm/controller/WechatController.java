package com.mio.crm.controller;

import com.mio.crm.service.MessageService;
import com.mio.wechat.request.WechatRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hel2 on 23/12/15.
 */
@Controller
@RequestMapping("/wechat")
public class WechatController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value="lifeDonut", produces="text/html;charset=UTF-8")
    @ResponseBody
    public String lifeDonutController(HttpServletRequest request){
        LifeDonut lifeDonut = new LifeDonut(request);
        System.out.println("test");
        System.out.println(request.toString());
        String str = lifeDonut.execute();
        final WechatRequest wechatRequest = lifeDonut.getWechatRequest();
        messageService.saveMessage(wechatRequest);
        return str;
    }
}
