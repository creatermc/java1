package Warehouse;

//пока с числами только
//пословицы )
//растет, легко добавляется все...но нужна небольшая оптимизация при редактировании
// TODO: 08.02.2020 менять значение в hello(), менять знчение в b, добавлять новый кейс

// TODO: 10.02.2020 намудрил...прежде чем мудрить надо копию оригинала сохранять...или откатывать

//System.out.println(str); заместо этого вызывать метод где и будет очищать строчку
/*
 * */
public class Proverbs {

    private static int verse;
    private static String str = "";

    private static int a = 1; // Начальное значение диапазона - "от" 
    private static int b = 18; // Конечное значение диапазона - "до"   //14
    private static int random_number1 = a + (int) (Math.random() * b); // Генерация

    static void text() {
        System.out.println("\r" + str + "\r");   // TODO: 09.02.2020 сюда воткнуть сетРандом?для вывода информации об кэйсе, r не очищает...
    }

    static void hello() {
        System.out.println("Пословицы: " + a + " - " + b);  // Пословицы + a + " b "  - т.е будет менятся значение b и показывать потом
    }

    static void setRandom_number1() {
        System.out.println(random_number1);
    }

    public static void main(String[] args) throws InterruptedException {

        hello();
        verse = random_number1;
      /*  System.out.println("Следующая начнется через пару секунд");  //может быть, когда нибудь
        Thread.sleep(500);*/
        for (int i = 0; i < 10; i++, verse++) {  //воткнул цикл //версия прибавляется //по длине кейсеов надо бы
            Thread.sleep(1000);
            switch (verse) {
                case 1:
                    str = "Хочешь сделать работу - сначала наточи инструменты.";
                    System.out.println(str);
                    str = "Прежде чем начать работу – наточи инструмент.";
                    System.out.println(str);
                    setRandom_number1();
                    text();
                    break;
                case 2:
                    str = "Дорогу осилит идущий.";
                    System.out.println(str);
                    setRandom_number1();
                    break;
                case 3:
                    str = "Подальше положишь, поближе возьмешь.";
                    System.out.println(str);
                    break;
                case 4:
                    str = "empty";
                    text();
                    break;
                case 5:
                    str = "Век живи - век учись.";
                    text();
                    break;
                case 6:
                    str = "Первый блин - комом.";
                    text();
                    break;
                case 7:
                    str = "Быстро только кошки родятся.";
                    text();
                    break;
                case 8:
                    str = "Маленькими шагами к большой цели.";
                    text();
                    break;
                case 9:
                    str = "Путь в тысячу миль начинается с одного шага.";
                    text();
                    break;
                case 10:
                    str = "На своих ошибках учатся, на чужих — делают карьеру.";
                    text();
                    break;
                case 11:
                    str = "Терпение и труд всё перетрут.";
                    text();
                    break;
                case 12:
                    str = "Бесплатный сыр бывает только в мышеловке";
                    text();
                    break;
                case 13:
                    str = "Главное – не победа, а участие.";
                    text();
                    break;
                case 14:
                    str = "Тяжело в учении, легко в бою.";
                    text();
                    break;
                case 15:
                    str = "Тише едешь, дальше будешь.";
                    text();
                    break;
                case 16:
                    str = "Не все то золото, что блестит.";
                    text();
                    break;
                case 17:
                    str = "Собирай по ягодке – наберешь кузовок.";
                    text();
                    break;
                case 18:
                    str = "Повторение - мать учения.";
                    text();
                    break;
                default:
                    System.out.println("error");
                    break;  //добавил а то в цикле одно и тоже //все равно одно и тоже
            }
        }
    }
}