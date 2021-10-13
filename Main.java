import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение с арабскими или римскими цифрами от 1 до 10 ");
        String input = in.nextLine(); // считали строку
        String[] strings = input.split(" ");  // разбили строку в массив черз пробелы

        int num1;
        int num2;
        String operator;


        if (checkString(strings[0]) && checkString(strings[2])) {
            num1 = Integer.parseInt(strings[0]);            //если на входе арабские цифры
            operator = strings[1];
            num2 = Integer.parseInt(strings[2]);

            if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {

                int result = Calculator.calc(num1, num2, operator);
                System.out.println(result);

            } else {
                throw new Exception("Введите цифры 1-10 или I-X");
            }
        } else if (checkString(strings[0]) != checkString(strings[2])) {
            throw new Exception("Не однородные переменные");
        } else {                                                               // если на входе римские цифры
            num1 = Converting.convertRomanToInt(strings[0]);
            num2 = Converting.convertRomanToInt(strings[2]);
            operator = strings[1];
            int result = Calculator.calc(num1, num2, operator);
            System.out.println(Converting.convertIntToRoman(result));

        }

    }

    // проверка на число
    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}