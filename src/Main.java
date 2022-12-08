public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18){
            System.out.println("Возраст не соответствует!");
        }
        //Задача 2
        int age1 = 24;
        if (age1 < 18) {
            System.out.println("На данный момент вы обучаетесь в школе");
        }
        if (age1 >= 18 && age1 < 23) {
            System.out.println("На данный момент вы обучаетесь в университете");
        }
        if (age1 > 23){
            System.out.println("Пора скать первую работу");
        }
        //Задача 3
        int capacitySit = 50;
        int capacityStand = 32;
        if (capacitySit == 60 ) {
            System.out.println("Сидячих мест нет");
        }
        if (capacitySit <60) {
            System.out.println("Есть сдячие места");
        }
        if (capacityStand == 42){
            System.out.println("Стоячх мест нет");
        }
        if (capacityStand <42){
            System.out.println("Стоячие места есть");
        }
    }
}