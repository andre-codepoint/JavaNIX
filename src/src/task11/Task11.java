package src.task11;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создайте программу, которая будет выводить числа последовательно в виде треугольника (floyd triangle). 
Число должно приходить в аргументах, пример вывода в следующей колонке	
Ввод: 5
Вывод:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(s.readLine());
        if (n>0) {
            int w =1;
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print(w+" ");
                    ++w;
                }

                System.out.println();
            }
        }

    }
}
