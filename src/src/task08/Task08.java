package src.task08;
/*
Создайте программу, которая выведет на экран таблицу умножения
 */
public class Task08 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                int r = i*j;
                System.out.println(String.format("%3d x %3d = %3d",i,j,r));
            }
        }
    }
}
