package Lecture10;

public class main {
    static String max = "0";

    public static String swap(String s, int i, int j) {
        char ith.charAt(i);
        char jth.charAt(j);
        String left s.substring(0, 1);
        String middle
        String right s.substring(j+1);
        s.substring(i+1, j);
        return left + jth+ middle +ith + right;
    }
    public static void findMaximum (String string, int k) {
        if(Integer.parseInt (string)> Integer.parseInt (max))
            max= string;
    }
    if(k == 0) {
        return;
    }
    for (int i = 0; i< string. length(); i++) {
        for (i = 1 + 1; j < string. length(); j+
        if(string.charAt (i) < string.charAt(j)) {
            string = swap(string, i, i);
            findMaximum(string,k - 1);
            //backtrack to its original state
            string = swap(string, i, j);
        }

    }
}
    public static void main(String[] args) {
        String s="254";
        int k = 2;

        findMaximum(s, k);
        System.out.println(max);
}
