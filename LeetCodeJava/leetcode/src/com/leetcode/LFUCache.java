package com.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 07/04/17.
 */
public class LFUCache {
    int capacity;
    Map<Integer, Integer> cache;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return super.removeEldestEntry(eldest);
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
