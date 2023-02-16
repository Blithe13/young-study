package com.yzc.basics;

public class JavaBasics {
    //Integer.valueOf()会首先判断该数据是否在缓存池中，多次调用会取同一个对象的引用
    static Integer x = Integer.valueOf(123);
    static Integer y = Integer.valueOf(123);
    String temp = y.toString();
    //new Integer()每次都会重新创建一个对象
    static Integer z = new Integer(123);

    public static void main(String[] args) {
        System.out.println(x == y);
        System.out.println(x == z);
    }
}
