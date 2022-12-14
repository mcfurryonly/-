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

        }else {
            System.out.println("Свободных мест нет");
        }
    }
}