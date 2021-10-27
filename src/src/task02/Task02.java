package src.task02;

public class Task02 {
    public static void main(String[] args) {
        Float number1;
        Float number2;
        if ((isNumeric(args[0]))&&((isNumeric(args[1])))) {
            number1 = Float.valueOf(args[0]);
            number2 = Float.valueOf(args[1]);
            Float result=null;
            if (args[2].equals("+"))
                result = (number1 + number2);
            if (args[2].equals("-"))
                result = (number1 - number2);
            if (args[2].equals("*"))
                result = (number1 * number2);
            if ((args[2].equals("/")))
                try {
                    if ((number2) != 0.0)
                    result = (number1) / (number2);
                    else {throw new ArithmeticException();}
                }
                catch (ArithmeticException e) {
                    System.out.println("Second argument must be not a zero");
                }
            if (result != null )System.out.println(result);
            else System.out.println("Result is incorrect. Please, check inputs.");
        }
        else
            System.out.println("Arguments must be a digit. Please, check inputs.");
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
