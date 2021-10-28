package src.task06;
/*
Создайте программу, которая переводит температуру в Фарингейтах
в температуру по цельсию
Ввод: 41
Вывод: 5
 */
public class Task06 {
    public static void main(String[] args) {
        Double tF = (5.0 / 9.0) * (Double.parseDouble(args[0]) - 32);
        System.out.println(String.format("%.0f",tF));
    }
}
