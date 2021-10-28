package src.task07;
/*
Создайте программу, которая принимает целое число и суммирует его цифры.
Число должно приходить в аргументах	Ввод: 123
Вывод: 6
 */
public class Task07 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while (n>0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
