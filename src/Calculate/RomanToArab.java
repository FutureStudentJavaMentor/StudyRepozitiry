package Calculate;

public class RomanToArab {
    public static final String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static final int[] number = {100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int DecodeRoman(String romans) {
        int result = 0;
        for (int i = 0; i < roman.length; i++) {
            while (romans.startsWith(roman[i])) {
                result += number[i];
                romans = romans.substring(roman[i].length());
            }
        }
        return result;
    }


}










