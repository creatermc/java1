package Warehouse.utils.variables;

public class Main {

    private static int verse = 1;

    public static void main(String[] args) {

        System.out.println("Float -  1");
        System.out.println("Long  - 2");
        System.out.println("Double  - 3");
        System.out.println("Integer - 4");
        System.out.println("Short - 5");

        //Float.Float();
        //Long.Long();
        //Double.Double();
        // Integer.Integer();
        // Short.Short();
        switch (verse) {
            case 1:
                Float.Float();
                break;
            case 2:
                Long.Long();
                break;
            case 3:
                Double.Double();
                break;
            case 4:
                Integer.Integer();
                break;
            case 5:
                Short.Short();
                break;

            default:
                System.out.println("error");
        }
    }
}


//Литералы - это неизменяемые значения

/* Целочисленные
byte
short
int
long l = 123456789012345L  или l

С плавающей точкой
double d = 12.2d  или D
float f = 123F  или f

Символьные и строковые литералы
char bigZ = 'Z';  //всегда одинарные кавычки для символов
String = "это строка" ; //всегда двойные кавычки для строк






 */