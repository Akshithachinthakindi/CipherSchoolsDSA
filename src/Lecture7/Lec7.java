package Lecture7;

public class Lec7 {
    public static void printAllDecoding(String number, String output)  {

        if(number.length() == 0) {

            System.out.println(output);


            return;
        }

        String firstCharacter = number.substring(0, 1);

        int firstNumber = Integer.parseInt(firstCharacter);

        char character = (char) ('a' + firstNumber - 1);

        printAllDecoding(number.substring(1), output:: output + character);


    }

    public static void main(String[] args) {

        printAllDecoding(number "23", output: "");
    }

}
}
