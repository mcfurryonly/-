public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 14;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст не соответствует!");
        }
        //Задача 2
        int age1 = 7;
        if (age1 > 6) {
            System.out.println("На данный момент вы обучаетесь в школе");
        } else {
            System.out.println("В школу еще рано");
        }
        int school = 18;
        if (school > 16) {
            System.out.println("На данный момент вы обучаетесь  в университете");
        } else {
            System.out.println("В универ еще рано");
        }
        int work = 24;
        if (work > 22) {
            System.out.println("Пора искать работу");

        } else {
            System.out.println("работу искать рано");
            // Задание 3
        }
        int passengers = 102;
        if (passengers < 90) {
            System.out.println("Свободные места, есть");

        } else {
            System.out.println("Свободных мест нет");
        }

        int howAge = 1;
        if (howAge >= 2 && howAge < 7 ) {
            System.out.println("Вы ходите в сад");
        } else {
            System.out.println("В сад еще рано");
        }
            int schoolAge = 15;
            if( schoolAge >= 7 && schoolAge < 19) {
                System.out.println("Вы ходите в школу");
            } else {
                System.out.println("В школу еще рано");
            }
            int univer = 20;
            if (univer >= 19 && univer < 24){
                System.out.println("Вы ходите в универ");
            } else {
                System.out.println("В универ еще рано");
            }
            int workAge = 25;
            if (workAge >= 24 ) {
                System.out.println("Пора на работу");
            } else {
                System.out.println("На работу рано");
            }

            int attraction = 5;
            boolean notAttraction = attraction >= 5 && attraction < 14;
            if (attraction < 5){
                System.out.println("Тебе еще рано на аттракционы");
            }
            if (notAttraction){
                System.out.println("Вы можете кататься на аттракционе только в сопровождении взрослого");
            } else {
                System.out.println("Вы можете кататься на аттракционе");
            }


            int one = 1;
            int two = 1;
            int three = 1;
            if (one > two && one > three){
                System.out.println("Первое число самое большое");
            }
            if (two > one && two > three){
                System.out.println("Второе число самое большое");
            }
            if (three > one && three > two){
                System.out.println("Третье число самое большое");
            } else {
                System.out.println("Все числа равны");
            }
    }
}