package com.example.practice.test;

import java.util.Scanner;

public class test1 {
    // TODO: 2022/9/16  编写一个reverseadd函数，实现两个数逆置后再求和的功能，比如输入123，456就是求321+654，输出975。注意：输入100,200输出3,（自动去除开头的0）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int add1 = scanner.nextInt();
        int add2 = scanner.nextInt();
        System.out.println(resultAdd(add1, add2));
    }
    public static int resultAdd(int add1, int add2){
        StringBuffer buffer1 = new StringBuffer(add1+"");
        StringBuffer buffer2 = new StringBuffer(add2+"");
        add1 = Integer.parseInt(buffer1.reverse().toString());
        add2 = Integer.parseInt(buffer2.reverse().toString());
        return add1 + add2;
    }
}
