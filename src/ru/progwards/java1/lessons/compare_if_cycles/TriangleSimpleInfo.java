package ru.progwards.java1.lessons.compare_if_cycles;

/*
1.1 Реализовать функцию
public static int maxSide(int a, int b, int c), которая получает параметрами длины сторон треугольника, а вернуть должна наибольшую длину стороны.
1.2 Реализовать функцию
public static int minSide(int a, int b, int c), которая получает параметрами длины сторон треугольника, а вернуть должна наименьшую длину стороны.
1.3 Реализовать функцию
public static boolean isEquilateralTriangle(int a, int b, int c), которая получает параметрами длины сторон треугольника, а вернуть должна true, если треугольник равносторонний и false в противном случае.
 */

// TODO: 16.12.2019

public class TriangleSimpleInfo {

    public static int a,b,c;
    public static int maxSide(int a, int b,int c) {  //вернуть наибольшую сторону треугольника


        if (a>b & a>c) {
            System.out.println(a);
            return a;}
        else if (b>a & b>c) {
            System.out.println(b);
            return b;
         }
        else {
            System.out.println(c);
            return c;
        }
    }

    public static int minSide(int a,int b,int c) {  //вернуть наименьшую сторону треугольника
        return 0;
    }

    //public static boolean isEquilateralTriangle(int a, int b ,int c){

    //}

    public static void main(String[] args) {

        maxSide(1,2,3);
        maxSide(1,3,2);
        maxSide(2,1,3);
        maxSide(2,3,1);
        maxSide(3,1,2);
        maxSide(3,2,1);

//        minSide(4,2,1);
        //minSide(1,2,3);
        //isEquilateralTriangle(1,2,3);
    }
}