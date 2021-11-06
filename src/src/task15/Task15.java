package src.task15;
/*
Напишите программу, которая инвертирует массив (значения должны идти в обратном порядке).
Проверьте работу программы на нескольких массивах	Ввод: [1, 2, 7, 30, 5, 70, 44]
Вывод: [44, 70, 5, 30, 7, 2, 1]
 */
public class Task15 {
    public static void main(String[] args) {
        if (args.length>0) {
            int [] mas = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                mas[i] = Integer.parseInt(args[args.length-i-1]);
            }
            for (int i = 0; i < args.length; i++) {
                if (i==0) System.out.print(mas[0]);
                else
                    System.out.print(", " + mas[i]);
            }
        }
        else System.out.println("Emty array");
    }
}
