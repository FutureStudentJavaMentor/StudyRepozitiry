package Calculate;


import java.util.Arrays;
import java.util.Scanner;
import static Calculate.operation.*;
import static Calculate.ArabToRoman.NumToRoman;
import  static Calculate.RomanToArab.*;


public class  Calculator {
    public static int num1, num2;
    public static int result;
    public static final String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
    public static final int[] numeric = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] words = string.split(" ");
        String st1 = words[0];
        String sign = words[1];
        String st2 = words[2];

        for (int i = 0; i < romans.length - 1; i++) {
            if (st1.equals(romans[i])) {
                num1=DecodeRoman(words[0]);
                num2=DecodeRoman(words[2]);
                break;
            } else if (st1.equals(String.valueOf(numeric[i]))) {
                num1 = Integer.parseInt(st1);
                num2 = Integer.parseInt(st2);
                break;
            }
        }



        switch (sign) {
            case "+" -> {
              result=summa(num1,num2);
            }
            case "-" -> {
                result=minus(num1,num2);
            }
            case "*" -> {
               result=multi(num1,num2);
            }
            case "/" -> {
               result=div(num1,num2);
            }
            default -> throw new Exception("Неверный арифметический знак ");
        }
        if(num1<1||num1>10){
            throw new NumberFormatException("Неверное знначение , приниматся цифры от 1 до 10 или от I до X");
        }else if(num2<1||num2>10){
            throw new NumberFormatException("Неверное знначение , приниматся цифры от 1 до 10 или от I до X");
        }

        if(Arrays.toString(romans).contains(st1)){
            System.out.println(NumToRoman(result));
        }else
            System.out.println(result);
    }

}






















