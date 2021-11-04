package src.task12;
/*
Напишите программу, которая отсортирует массив по возрастанию.
Проверьте работу программы на нескольких массивах
Ввод: [24, 13, -1, 2, 4, 70, 44]
Вывод: [-1, 2, 4, 13, 24, 44, 70]
 */
public class Task12 {
    public static void main(String[] args) {
        if (args.length>0) {
            int[] mas = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                if (i==0) System.out.print(args[i]);
                else
                System.out.print((", " + args[i]));
            }
            for (int i = 0; i < args.length; i++) {
                mas[i] = Integer.parseInt(args[i]);
            }
            int a, a1, a2;

            for (int j = mas.length-1; j >0 ; j--) {
                for (int i = 0; i < j ; i++) {
                    a1 = mas[i];
                    a2 = mas[i+1];
                    if (mas[i] > mas[i+1]) {
                        a= mas[i+1];
                        mas[i+1] = mas[i];
                        mas[i]=a;
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < mas.length ; i++) {
                if (i==0) System.out.print(mas[i]);
                else
                    System.out.print((", " + mas[i]));
            }
        } else {
            System.out.println("Sorry, Array is empty. Sorting is impossible!");
        }

    }
}
