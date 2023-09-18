import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String[] calcArgs = scanner.nextLine().trim().split(" ");
            if (calcArgs.length != 3) {
                if (calcArgs.length < 3) {
                    throw new Exception("строка не является математической операцией");
                }
                if (calcArgs.length > 3) {
                    throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
            int firstNumber = Integer.parseInt(calcArgs[0]);
            String operation = calcArgs[1];
            int secondNumber = Integer.parseInt(calcArgs[2]);
            if(!(firstNumber >= 1 && firstNumber <= 10 && secondNumber >= 1 && secondNumber <= 10)) {
                throw new Exception("Числа не могут быть меньше 1 или больше 10");
            }
            int result;
            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                default:
                    throw new Exception("строка не является математической оперцией");
            }
            System.out.println(result);
        }
        catch (Exception exception) {
            System.out.println("throws Exception //т.к. " + exception.getMessage());
        }

    }
}
