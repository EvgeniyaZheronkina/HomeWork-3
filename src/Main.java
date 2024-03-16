public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 16;

        if (age >= 18){
            System.out.println("Если возраст человека равен" +age +", то он совершенолетний");
        }
        else{
            System.out.println("Если возраст человека равен " +age +", то он не достиг совершенолетия, нужно немного подождать");
        }

        //Задание 2
        System.out.println("Задание 2");
        int temperature = 7;

        if (temperature <= 5) {
            System.out.println("На улице " +temperature+ " градусов. На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " +temperature+ " градусов. Сегодня тепло, можно идти без шапки");
        }
    }
}