package com.greekk.hometask1;
/*
Переместить i, либо убрать, чтобы i объявлялась после if блока или не была доступна после if блока
(в этом случае вывод в консоль уберите), либо код работал без переноса i до блока if.
При этом нельзя менять название переменной.
boolean isTrue = true;
*/

public class FourthTask {
    public static void wrongFunction(){
        boolean isTrue = false;
        int i = 0;
        if (isTrue) {
            i += 10;
            System.out.println(i);
        } else {
            i -= 10;
            System.out.println(i);
        }
        System.out.println(i);
    }

    public static void correctedFunction(){
        boolean isTrue = false;
        if (isTrue) {
            int i = 10;
            System.out.println(i);
        } else {
            int i = 10;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {


    }

}
