package src.task03;
/*
Создайте массив чисел и выведите этот массив на экран
Вывод: 1,2,3,4,7,15
 */

import java.util.stream.Stream;
public class Task03 {
    public static void main(String[] args) {
        int[] myAray = new int[]{1, 2, 3, 4, 7, 15};
        Stream.of(myAray).forEach(System.out::println);
    }
}
