package src.task14;
/*
Напишите программу, которая посчитает min и max значение в массиве.
Проверьте работу программы на нескольких массивах
Ввод: [24, 13, -1, 2, 4, 70, 44]
Вывод: min = -1, max = 70
 */
public class Task14 {
    public static void main(String[] args) {
        if (args.length>0) {
            int[] mas = new int[args.length];
            int min, max;
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i])>max)
                    max = Integer.parseInt(args[i]);
                if (Integer.parseInt(args[i])<min)
                    min = Integer.parseInt(args[i]);
            }
           System.out.printf("min = %s, max = %s",min,max);
        } else {
            System.out.println("Sorry, Array is empty. Computing is impossible!");
        }
    }
}