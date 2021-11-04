package src.task13;
/*
Напишите программу, которая посчитает среднее значение в массиве положительных чисел.
Проверьте работу программы на нескольких массивах	Ввод: [1, 2, 7, 30, 5, 70, 44]
Вывод: 22.714
 */
public class Task13 {
    public static void main(String[] args) {
        if (args.length>0) {
            double s=0;
            for (int i = 0; i < args.length; i++) {
                s = s + Integer.parseInt(args[i]);
            }
            System.out.printf("%.3f",(s/args.length));
        } else {
            System.out.println("Sorry, Array is empty. Computing is impossible!");
        }

    }
}

