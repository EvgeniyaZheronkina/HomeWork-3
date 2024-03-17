public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 15;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершенолетия, нужно немного подождать");
        }

        //Задание 2
        System.out.println("Задание 2");
        int temperature = -5;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }

        // Задание 3
        System.out.println("Задание 3");
        int speed = 70;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задание 4
        System.out.println("Задание 4");
        int agePerson = 18;

        if (agePerson >= 2 && agePerson <= 6){
            System.out.println("Если возраст человека равен " +agePerson+ ", то ему нужно ходить в детский сад.");
        } else if (agePerson >= 7 && agePerson <= 17){
            System.out.println("Если возраст человека равен " +agePerson+ ", то ему нужно ходить в школу.");
        } else if (agePerson >= 18 && agePerson <= 24){
            System.out.println("Если возраст человека равен " +agePerson+ ", то ему нужно ходить в университет.");
        } else if (agePerson > 24){
            System.out.println("Если возраст человека равен " +agePerson+ ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Слишком маленький возраст");
        }

        // Задание 5
        System.out.println("Задание 5");
        int ageChild = 7;

        if (ageChild < 5){
            System.out.println("Если возраст ребенка равен " +ageChild+ ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= 7 && ageChild <= 17) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (ageChild >= 7 && ageChild <= 17) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Вы слишком маленький или взрослый");
        }

        // Задание 6
        System.out.println("Задание 6");
        int seatsInTheCarriage = 89;

        if (seatsInTheCarriage >=1 && seatsInTheCarriage <= 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (seatsInTheCarriage > 60 && seatsInTheCarriage <= 102) {
            System.out.println("В вагоне есть только стоячее места");
        } else {
            System.out.println("Вагон полность забит");
        }

        // Задание 7
        System.out.println("Задание 7");
        int one = 13;
        int two = 6;
        int three = 36;

        if (one > two && one > three) {
            System.out.println("Число " +one+ " больше чем " +two+ " и " +three);
        } else if (two > one && two > three) {
            System.out.println("Число " +two+ " больше чем " +one+ " и " +three);
        } else {
            System.out.println("Число " +three+ " больше чем " +one+ " и " +two);
        }
    }
}