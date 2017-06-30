package human;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу которая считает 4 числа c клавиатуры и выведет на
 экран самое большое из них.
 */
public class Max {
    public static void main(String[] args) {
        System.out.println("Введите 4 числа:");
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

