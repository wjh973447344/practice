package com.example.practice.test;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Locale;

public class test2 {
    // TODO: 2022/9/16  输入一个字符串，此字符串中包含有大小写字母，逗号（“，”），空格（“  ”），现需要对其进行初始化。
    //初始化规则：每个逗号或空格后紧跟的第一个字母如果已经是大写，则保持不变，否则变为大写；其余字母如果有大写的，需要变为小写字母，而小写字母不变；逗号或空格原样输出。（要求输出后仍然是一个字符串）
    public static void main(String[] args) {
        String a = "abc,DeF ghi JKL,oPq";
        getString(a);
    }
    public static void getString(String a){
        char array[] =  a.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ',' || array[i] == ' '){
                if (array[i+1] >= 97 && array[i+1] <= 122){
                    array[i+1] = (char) (array[i+1]-32);
                }
                i++;
            }else{
                if(array[i] >= 65 && array[i] <= 90){
                    array[i] = (char) ((char) array[i]+32);
                }
            }
        }
        System.out.println(String.valueOf(array));
    }
}
