package com.test;

import java.io.*;

/**
 * Created by qiudeyang on 23/04/17.
 */
class Person implements Serializable{
    int age;
    String name;
    String sex;
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String toString(){
        return "age="+age+" name="+name+" sex="+sex;
    }
}
public class TestSeriable {
    public static void serize() throws IOException{
        Person p = new Person();
        p.setAge(23);
        p.setName("qiudeyang");
        p.setSex("male");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/oos.txt"));
        oos.writeObject(p);
        System.out.println("序列化结束");
        oos.close();
    }

    public static Person deserize() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/oos.txt"));
        Person p = (Person)ois.readObject();
        System.out.println("反序列化结束");
        return p;
    }
    public static void main(String[] args) throws Exception{
        serize();
        Person p = deserize();
        System.out.println(p);
    }
}
