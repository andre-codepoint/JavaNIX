package src.task10;
/*
Напишите генератор случайных чисел (от 1 до 7), выведите день недели соответствующий числу	Вывод:
1 - Понедельник
3 - Среда
*/
public class Task10 {
    public static void main(String[] args) {
            int day = (int) ((Math.random() * 8));
            switch (day) {
                case 1: {
                    System.out.println("1 - Понедельник");
                    break;
                }
                case 2: {
                    System.out.println("2 - Вторник");
                    break;
                }
                case 3: {
                    System.out.println("3 - Среда");
                    break;
                }
                case 4: {
                    System.out.println("4 - Четверг");
                    break;
                }
                case 5: {
                    System.out.println("5 - Пятница");
                    break;
                }
                case 6: {
                    System.out.println("6 - Суббота");
                    break;
                }
                case 7: {
                    System.out.println("7 - Воскрсенье");
                    break;
                }
            }
        }
}