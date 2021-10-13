public class Converting {
    public static String convertIntToRoman(int num) {

        int[] numbers = {100, 90,
                50, 40, 10, 9, 5, 4, 1};

        String[] letters = {"C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};

        String roman = "";

        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                roman += letters[i];
                num -= numbers[i];
            }
        }
        return roman;
    }

    static int convertRomanToInt(String letter) throws Exception{

        int num = 0;
        switch (letter) {
            case "I":
                num = 1;
                break;
            case "II":
                num = 2;
                break;
            case "III":
                num = 3;
                break;
            case "IV":
                num = 4;
                break;
            case "V":
                num = 5;
                break;
            case "VI":
                num = 6;
                break;
            case "VII":
                num = 7;
                break;
            case "VIII":
                num = 8;
                break;
            case "IX":
                num = 9;
                break;
            case "X":
                num = 10;
                break;

            default:
                throw new Exception("Вы ввели некорректный символ");
        }
        return num;
    }
}
