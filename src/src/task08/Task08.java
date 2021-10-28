package src.task08;
/*
Создайте программу, которая выведет на экран таблицу умножения
 */
public class Task08 {
    public static void main(String[] args) {
        System.out.printf(String.format("%3s","X"));
        for (int j = 1; j <=9 ; j++) {
             System.out.printf(String.format("%3d",j));
        }
        System.out.printf(String.format("%n"));
        for (int i = 1; i <=9; i++) {
            System.out.printf(String.format("%3d",i));
            for (int j = 1; j <=9 ; j++) {
                int r = i*j;
                System.out.printf(String.format("%3d",r));
            }
            System.out.printf(String.format("%n"));
        }
    }
}
