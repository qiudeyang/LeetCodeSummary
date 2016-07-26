package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 07/06/16.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("username","qiudeyang");
        map.put("username","wenbo");
        System.out.println(map.size());
        System.out.println(map.get("username"));
    }
}
