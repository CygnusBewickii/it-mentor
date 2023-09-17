import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String[] calcArgs = scanner.nextLine().trim().split(" ");
            if (calcArgs.length != 3) throw new Exception();
            int firstNumber = Integer.parseInt(calcArgs[0]);
            String operation = calcArgs[1];
            int secondNumber = Integer.parseInt(calcArgs[2]);
            if(!(firstNumber >= 1 && firstNumber <= 10 && secondNumber >= 1 && secondNumber <= 10)) throw new Exception();
            switch (operation) {
                case "+":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "*":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "/":
                    System.out.println((float)firstNumber / (float)secondNumber);
                    break;
                default:
                    throw new Exception();
            }
        }
        catch (Exception exception) {
            System.out.println("trows Exception");
        }

    }
}
