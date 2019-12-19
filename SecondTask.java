package com.greekk.hometask1;
//Упростить конструкцию: if(i < 10 && i >= 60 || i == 9).....
public class SecondTask {
    public static void main(String[] args) {
        int  i = 60;
        boolean expr = i < 10 && i >= 60 || i == 9;
        if(expr){
            System.out.println(i);
        }
    }
}
