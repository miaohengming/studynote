package com.miao.base;

public class forDemo1<psvm> {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        //遍历数组中元素
        for (int number : numbers) System.out.println(number);//输出三角形
        for (int i = 1; i <= 5; i++)
        {
            for (int j=5;j>i;j--) System.out.print(' ');
            for (int j=1;j<2*i;j++) System.out.print('*');
            System.out.println();
        }

    }
}
//for (int number : numbers)
//foreach number in numbers