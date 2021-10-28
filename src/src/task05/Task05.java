package src.task05;
/*
Создайте массив чисел и выведите этот массив на экран
Вывод: 1,2,3,4,7,15
 */

import static java.util.stream.Collectors.joining;

public class Task05 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 7, 15};
//        IntStream.of(myAray).forEach(x-> System.out.format("%s, ",x));
        for(int i = 0;i<myArray.length;i++){
            System.out.print(myArray[i]);
            if(i<(myArray.length-1))
                System.out.print(",");
        }

        }
    }

