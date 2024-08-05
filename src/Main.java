/*
Мы сканер не проходили,
в интернете как то попалось, решил тут применить.
Надеюсь проверять будет интереснее и приятнее
Правда как это работает не очень понял (но вроде работает)
*/
import java.util.Scanner;

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
    /*
    С помощью условного оператора напишите программу, которая выводит в консоль:
    сообщение о том, что человеку 18 или больше лет;
    сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
    */
        System.out.println("Задача 1");
        System.out.print("Введите возраст:");
        Scanner ageHuman = new Scanner (System.in);
        byte age = ageHuman.nextByte();
        if ( age >= 18 ) {
            System.out.println ("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }else {
            System.out.println ("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2(){
    /*
    Человек одевается в зависимости от температуры воздуха.
    Напишите программу, которая выводит сообщение:
    «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
    «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
    */
        System.out.println("Задача 2");
        System.out.print("Введите градусы:");
        Scanner outdoorTemperature = new Scanner(System.in);
        byte degrees = outdoorTemperature.nextByte();
        if ( degrees < 5 ){
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку.");
        }else {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки.");
        }
    }

    public static void task3(){
    /*
    За превышение скорости водителю могут выписать штраф.
    Напишите программу, которая сообщает водителю о том, что:
    скорость превышена, если она больше 60 км/ч;
    превышения скорости нет, если она меньше 60 км/ч.
    */
        System.out.println("Задача 3");
        System.out.print("Введите скорость:");
        Scanner speedCar = new Scanner(System.in);
        byte speed = speedCar.nextByte();
        if ( speed > 60 ){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4(){
    /*
    Напишите программу, которая помогает определить,
    в какое учреждение нужно отправить человека в зависимости от его возраста:
    Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
    Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
    Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
    А если человеку больше 24, то ему пора ходить на работу.
    */
        System.out.println("Задача 4");
        System.out.print ("Введите возраст:");
        Scanner agePerson = new Scanner(System.in);
        byte age = agePerson.nextByte();
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
    /*
    Как правило, на аттракционах действуют ограничения для детей по возрасту:
    Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
    Если ребенку больше 5, но меньше 14 лет, то он может кататься только
    в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
    Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
    */
        System.out.println("Задача 5");
        System.out.print("Введите возраст:");
        Scanner ageAttraction = new Scanner(System.in);
        byte age = ageAttraction.nextByte();
        if ( age < 5 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if ( age >= 5 && age < 14 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if ( age >=14 && age < 18 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else if ( age >= 18 ) { // от себя добавил, для логики
            System.out.println("Это уже не ребёнок)");
        }
    }

    public static void task6(){
    /*
    Вместимость одного вагона поезда — 102 человека.
    Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
    */
        System.out.println("Задача 6");
        System.out.print("Введите кол-во пассажиров:");
        Scanner train = new Scanner(System.in);
        int passengers = train.nextInt();
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
    /*
    Даны три числа:
    int one;
    int two;
    int three;
    С помощью условного оператора и конструкции else напишите программу,
    которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.
     */
        System.out.println("Задача 7");
        System.out.println("Введите три числа(через ENTER):");
        Scanner one1 = new Scanner(System.in);
        Scanner two2 = new Scanner(System.in);
        Scanner three3 = new Scanner(System.in);
        int one = one1.nextInt();
        int two = two2.nextInt();
        int three = three3.nextInt();
        if ( one > two && one > three ){
            System.out.println("Число " + one + " больше других чисел.");
        } else if ( two > one && two > three ) {
            System.out.println("Число " + two + " больше других чисел.");
        } else {
            System.out.println("Число " + three + " больше других чисел.");
        }
    }
}