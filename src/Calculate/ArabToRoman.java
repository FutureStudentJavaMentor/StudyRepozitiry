package Calculate;

public class ArabToRoman  {
    public static final String [] romans={"C","XC","L","XL","X","IX","V","IV","I"};
    public static final int[]numbers={100,90,50,40,10,9,5,4,1};

    public static  String NumToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}








