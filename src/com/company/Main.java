package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 100000;
        //зарплата до вычета нДФЛ
        int b = 13;
        //число для формулы расчета НФЛД
        int c = 100;
        //число для формулы расчета НФЛД
        int d = a/c*b;
        //число для формулы расчета НФЛД

        int i = a-d;
        //Зарплата за вычетом НДФЛ
        System.out.println(i);
    }
}
