import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        System.out.println(calc(action));





    }
    public static String calc(String input) {
        String[] RimWorld = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] arrayNumbers = new String[10];
        String result = "";
        String[] chars;

        for (int i = 0; i < 10; i++) {
            arrayNumbers[i] = String.valueOf(i + 1);
        }

        chars = input.split("\s", 3);

        if (Arrays.asList(arrayNumbers).contains(chars[0]) & Arrays.asList(arrayNumbers).contains(chars[2])) {
            switch (chars[1]) {
                case "+" -> result = String.valueOf(Integer.parseInt(chars[0]) + Integer.parseInt(chars[2]));
                case "-" -> result = String.valueOf(Integer.parseInt(chars[0]) - Integer.parseInt(chars[2]));
                case "*" -> result = String.valueOf(Integer.parseInt(chars[0]) * Integer.parseInt(chars[2]));
                case "/" -> result = String.valueOf(Integer.parseInt(chars[0]) / Integer.parseInt(chars[2]));
            }
        } else {
            switch (chars[1]) {
                case "+" -> result = RimWorld[Integer.parseInt(search(chars[0], chars, 0)) + Integer.parseInt(search(chars[2], chars, 2) + 1)];
                case "-" -> result = RimWorld[Integer.parseInt(search(chars[0], chars, 0)) - Integer.parseInt(search(chars[2], chars, 2)) - 1];
                case "*" -> result = RimWorld[((Integer.parseInt(search(chars[0], chars, 0))) + 1) * ((Integer.parseInt(search(chars[2], chars, 2))) + 1) - 1];
                case "/" -> result = RimWorld[((Integer.parseInt(search(chars[0], chars, 0))) + 1) / ((Integer.parseInt(search(chars[2], chars, 2))) + 1) - 1];
            }
        }
        return result;
    }

    public static String search(String symbol, String[] dia, int pos) {
        String[] arrayRimNumbers = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String res;
        if (Arrays.asList(arrayRimNumbers).contains(dia[pos])) {
            res = String.valueOf(Arrays.asList(arrayRimNumbers).indexOf(dia[pos]));
        } else {
            res = "no chance";
        }
        return res;
        }
    }