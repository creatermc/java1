package ru.progwards.T4;

public class CycleWhileContinue {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5){
            i ++;

            if (i == 3) {
                System.out.println("Сработал continue...");
                continue; //не прирывает цикл, передает в начало
            }
            System.out.println("Строка " + i);
        }
    }
}
