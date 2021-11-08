package com.miao.base;

public class Demo2 {
    public static void main(String[] args) {
        int a=0x10;
        System.out.println(a);

        //精度问题，最好完全避免浮点数比较
        float d1=2147483648f;
        float d2=2147483648f;
        System.out.println(d1==d2);//相等
        d2+=200;
        System.out.println(d1==d2);//不相等
        d2-=100;
        d2-=100;
        System.out.println(d1==d2);//不相等
    }
}
/*
进制前缀
2:0b
8:0
16:0x
 */