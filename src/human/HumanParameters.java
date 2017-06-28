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
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Как Вас зовут?");
        String name = r.readLine();
        System.out.println("В каком городе Вы живете?");
        String city = r.readLine();
        System.out.println("Сколько Вам лет? ");
        int age = Integer.parseInt(r.readLine());
        System.out.println("Какое Ваше хобби?");
        String hobby = r.readLine();
        System.out.println("Вариант 1 (табличный):");
        System.out.println();
        System.out.println("Имя: " + name + "\n" + "Город: " + city + "\n" + "Возраст: " + age + "\n" + "Хобби: " + hobby);
        



    }
}
