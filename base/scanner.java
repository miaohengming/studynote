package com.miao.base;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int i;

        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println("11111111111111111111");
            i=scanner.nextInt();//接收输入的数据，使得下一条判断需要重新输入数据
        }
        if (scanner.hasNextByte()) {
            System.out.println("22222222222222222222");
        }
        if (scanner.hasNextLine()) {
            System.out.println("33333333333333333333");
        }
        System.out.println(scanner.nextLine());

        scanner.close();

    }
}
/*
Scanner类        (扫描仪)实现程序和人的交互
next()          获取输入的字符串
hasNext()       判断是否输入字符串
nextLine()
hasNextLine()
 */