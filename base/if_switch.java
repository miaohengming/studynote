package com.miao.base;

public class if_switch {
    public static void main(String[] args) {
        String s1="miao";
        String s2="heng";
        if(s1=="miao") System.out.println("111");
        if(s2.equals("heng")) System.out.println("222");

        int c;
        String name="秦疆";
        switch(name){
            case "秦疆":
                c=1;
                break;
            case "狂神":
                c=2;
                break;
            case "1":
                c=3;
                break;
            default:
                c=0;
        }
        System.out.println(c);
    }
}
