package human;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by 1 on 28.06.2017.
 */
public class HumanParameters {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        String name = sc.nextLine();
        System.out.println("В каком городе Вы живете?");
        String city = sc.nextLine();
        System.out.println("Сколько Вам лет? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Какое Ваше хобби?");
        String hobby = sc.nextLine();
        System.out.println("Вариант 1 (табличный):");
        System.out.println();
        System.out.println("Имя: " + name + "\n" + "Город: " + city + "\n" + "Возраст: " + age + "\n" + "Хобби: " + hobby);
        System.out.println();
        System.out.println("Вариант 2 (текстовый):");
        System.out.println();
        System.out.println("Человек по имени " + name +  " живет в городе " + city + "." + " Этому человеку " +  age + " лет и любит он заниматься " +  hobby + ".");
        System.out.println();
        System.out.println("Вариант 3 (иной):");
        System.out.println();
        System.out.println(name + " - Имя" + "\n" + city + " - Город" + "\n" + age + " - Возраст" + "\n" + hobby + " - Хобби");



    }
}
