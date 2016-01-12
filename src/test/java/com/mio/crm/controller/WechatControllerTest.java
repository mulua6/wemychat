package com.mio.crm.controller;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liuhe on 15/12/27.
 * update
 */
public class WechatControllerTest {



    @Test
    public void testArrays(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("zxy");
        list.add("abc");
        list.add("bcd");
        list.add("cde");

        Object[] arrays = list.toArray();
        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }



    }

}
