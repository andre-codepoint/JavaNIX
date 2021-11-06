package src.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Напишите программу, которая найдет пересечение в двух массивах чисел.
Проверьте работу программы на нескольких массивах
Ввод: [1, 2, 7, 30, 5, 70, 44] , [1, 4, 17, 30, 28, 99]
Вывод: [1, 30]
 */
public class Task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
//        String s1 = s.readLine();
//        String s2 = s.readLine();
        String s1 = "1, 2, 4, 7, 30, 5, 70, 44";
        String s2 = "1, 4, 17, 7, 30, 28, 99";
        String[] mas1 = s1.split(",\\s*");
        String[] mas2 = s2.split(",\\s*");
        boolean eq = false;
        if ((mas1.length>0)&&(mas2.length>0)) {
            for (int i = 0; i < mas1.length; i++) {
                for (int j = 0; j < mas2.length; j++) {
                    if ((mas1[i].equals(mas2[j]))) {
                        if ((!eq)) {
                            System.out.print(mas1[i]);
                            eq = true;
                        }
                        else
                             System.out.print(", " + mas1[i]);

                    }
                }
            }
        }
        else System.out.println("Empty array");
    }
}

