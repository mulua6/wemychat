package com.mio.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by hel2 on 23/12/15.
 */
@Controller
@RequestMapping("/wechat")
public class WechatController {

    @RequestMapping(value="forReg.do", produces="text/html;charset=UTF-8")
    @ResponseBody
    public String forRefister(HttpServletRequest request){
        LifeDonut lifeDonut = new LifeDonut(request);
        return lifeDonut.execute();
    }
}
