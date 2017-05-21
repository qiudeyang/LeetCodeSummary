package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 07/06/16.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
