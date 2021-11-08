package com.miao.base;

public class Demo4 {
    public static void main(String[] args) {
        int i=950;
        byte b=(byte)i;//i=b%256;if(i>127) i-=256;
        System.out.println(i);
        System.out.println(b);

        int j=12_3456_7890;
        System.out.println(j);
    }
}
/*
强制转换    (类型)变量名     高->低    存在内存问题、精度丢失
自动转换    低->高
 */
