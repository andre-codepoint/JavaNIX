package src.task09;
/*
Создайте программу, которая выведет на экран числа фибоначи до указанного числа.
Число должно приходить в аргументах
Ввод: 50
Вывод: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
public class Task09 {
    public static void main(String[] args) {
        int f = 0;
        int fp = 0;
        int fn = 0;
        int n = Integer.parseInt(args[0]);
        while (f <= n ) {
            if (f == 0) System.out.print(f);
                else System.out.print(", " + f);
            if (f == 0) fn = fp + 1;
            else {
                fn = fp + f;
                fp = f;
            }
            f = fn;
        }
    }
}
