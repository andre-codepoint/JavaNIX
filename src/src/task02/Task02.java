package src.task02;

public class Task02 {
    public static void main(String[] args) {
        Float number1 = Float.valueOf(args[0]);
        Float number2 = Float.valueOf(args[1]);
        Float result=null;
        if (args[2].equals("+"))
            result = (number1 + number2);
        if (args[2].equals("-"))
            result = (number1 - number2);
        if (args[2].equals("*"))
            result = (number1 * number2);
        if (args[2].equals("/"))
            result = (number1) / (number2);
        if (result != null )System.out.println(result);
        else System.out.println("Result is incorrect. Please, check inputs.");
    }
}
