package com.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by qiudeyang on 15/06/16.
 */
public class TestHashTable {
    private static void testHashTableAPIs(){
        Random r = new Random();
        Hashtable table = new Hashtable();
        table.put("one",r.nextInt(10));
        table.put("two",r.nextInt(10));
        table.put("three",r.nextInt(10));
        System.out.println("table:"+table);
        Iterator itr = table.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("next : " + entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(table.size());
        System.out.println(table.containsKey("one"));
        System.out.println(table.containsKey("five"));
        System.out.println(table.containsValue(new Integer(0)));
        table.remove("three");
        System.out.println("table:"+table);
        table.clear();
        System.out.println((table.isEmpty())?"it is empty":"it is not empty");
    }
    public static void main(String[] args) {
        testHashTableAPIs();
    }

}
