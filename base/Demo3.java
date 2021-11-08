package com.miao.base;

public class Demo3 {
    public static void main(String[] args) {
        char c1='\u0061';
        char c2=20013;
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        String sa=new String("Hello world");
        String sb=new String("Hello world");
        System.out.println(sa==sb);//不等

    }
}
