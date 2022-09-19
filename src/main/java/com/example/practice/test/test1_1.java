package com.example.practice.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1_1 {
    // TODO: 2022/9/16 编写一个reverseadd函数，实现两个数逆置后再求和的功能，比如输入123，456就是求321+654，输出975。注意：输入100,200输出3,（自动去除开头的0 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int add1 = scanner.nextInt();
        int add2 = scanner.nextInt();
        System.out.println(resultAdd(add1, add2));
    }
    public static int resultAdd(int add1,int add2){
        ArrayList<Integer> array_add1 = new ArrayList<Integer>();
        ArrayList<Integer> array_add2 = new ArrayList<Integer>();
        while(add1 != 0 || add2 != 0){
            if(add1 != 0){
                array_add1.add(add1 % 10);
                add1 = add1 / 10;
            }
            if(add2 != 0){
                array_add2.add(add2 % 10);
                add2 = add2 / 10;
            }
        }
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < array_add1.size(); i++){
            result1 = result1 * 10 + array_add1.get(i);
        }
        for (int i = 0; i < array_add2.size(); i++){
            result2 = result2 * 10 + array_add2.get(i);
        }
        return result1 + result2;
    }
}
