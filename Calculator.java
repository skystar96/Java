public class Calculator {
    public static int calc(int num1, int num2, String operator) throws Exception{
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new Exception("Вы ввели неправильный математический оператор");
        }
        return result;
    }
}
