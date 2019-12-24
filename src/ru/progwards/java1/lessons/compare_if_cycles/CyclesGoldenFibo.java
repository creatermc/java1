package ru.progwards.java1.lessons.compare_if_cycles;

/*3.1 Реализовать функцию
public static boolean containsDigit(int number, int digit), которая будет возвращать true, если число number содержит цифру digit.

Теперь проведём исследование. Есть ли у Золотого треугольника связь с числами Фибоначчи. Золотой треугольник это равнобедренный треугольник у которого ребро относится к основанию как 1.61803 (приблизительно),
 то есть по правилу Золотого сечения. Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... в котором первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих.
Для проведения этого исследования нам придётся решить две задачи.

3.2 Реализовать, используя любой цикл, функцию
public static int fiboNumber(int n), которая будет возвращать n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
3.3 Реализовать функцию
public static boolean isGoldenTriangle(int a, int b, int c), которая будет возвращать true, если треугольник со сторонами a, b, c является Золотым. Определим критерии. Он должен быть равнобедренным и отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.
Далее в функции public static void main(String[] args) вывести на консоль, используя цикл, 15 первых чисел Фибоначчи. После этого, используя вложенные циклы, определить: есть ли среди треугольников, длины сторон которых являются натуральными числами не превышающими 100, Золотые треугольники. И если есть, вывести на консоль длины основания и рёбер этих треугольников.
Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи и Золотыми треугольниками.
* */

public class CyclesGoldenFibo {


    public static  int n;
    public static int a;
    public static int b;

    public static int number;
    public static int digit;

    public static boolean containsDigit(int number, int digit) {

        if (number == digit) {
            System.out.println("false");
            return false;
        } else {

            System.out.println("true");
            return true;
        }
    }

//возвращать n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    public static int fiboNumber(int n) {
// Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

        int fibo;
        int a = 1;
        int b = 0;

        for (int i = 0; i < n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
            System.out.println("Fibo = " + fibo);
            continue;

        }

        return n;
    }

//которая будет возвращать true, если треугольник со сторонами a, b, c является Золотым.
// Определим критерии. Он должен быть равнобедренным и отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.
    public static boolean isGoldenTriangle(int a, int b, int c){
return false;
    }


    public static void main(String[] args) {
        //fiboNumber(10);
        containsDigit(32,32);
        containsDigit(32,31);
    }
}
