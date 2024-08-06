public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){

        byte age = 15;
        if ( age >= 18 ) {
            System.out.println ("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }else {
            System.out.println ("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2(){

        byte degrees = 6;
        if ( degrees < 5 ){
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку.");
        }else {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки.");
        }
    }

    public static void task3(){

        byte speed = 50;
        if ( speed > 60 ){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4(){

        byte age = 15;
        if ( age > 2 && age <= 6 ){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if ( age >= 7 && age <= 17 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if ( age >= 18 && age <= 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if ( age > 24 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task5(){

        byte age = 12;
        if ( age < 5 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if ( age >= 5 && age < 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6(){

        int passengers = 20;
        int total = 102;
        int sit = 60;
        int standing = total - sit;
        if ( passengers < sit ){
            System.out.println("В вагоне есть " + ( sit - passengers ) + " сидячих мест и " + standing + " стоячих мест.");
        }else if ( passengers >= sit && passengers < total ){
            System.out.println("В вагоне нет сидячих мест, но есть " + ( total - passengers ) + " стоячих мест.");
        }else {
            System.out.println("Мест нет!");
        }
    }

    public static void task7(){

        int one = 5;
        int two = 7;
        int three = 12;
        if ( one > two && one > three ){
            System.out.println("Число " + one + " больше других чисел.");
        } else if ( two > one && two > three ) {
            System.out.println("Число " + two + " больше других чисел.");
        } else {
            System.out.println("Число " + three + " больше других чисел.");
        }
    }
}