package src.task16;
/*
Напишите программу, которая найдет дубликаты в массиве чисел. Проверьте работу программы на нескольких массивах
Ввод: [1, 2, 2, 30, 5, 70, 44, 30]
Вывод: [2, 30]
 */
public class Task16 {
    public static void main(String[] args) {
        boolean eq = false;
        if (args.length>0) {
            for (int i = 0; i < args.length; i++) {
                for (int j = i+1; j < args.length; j++) {
                    if ((args[i].equals(args[j]))) {
                    if ((!eq)) {
                        System.out.print(args[j]);
                        eq = true;
                    }
                        else
                            System.out.print(", " + args[j]);

                    }
                }
            }
         }
        else System.out.println("Empty array");
    }
}
