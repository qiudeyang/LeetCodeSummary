package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qiudeyang on 09/05/17.
 */
public class PatternMatcher {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while(m.find()) {
            System.out.println(m.group());
            System.out.print("start:"+m.start());
            System.out.println(" end:"+m.end());
        }
        System.out.println("ab".hashCode());


    }
}
