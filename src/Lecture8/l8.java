package Lecture8;

public class l8 {
    public class Main
    {
        public static int fact(int n) {
            if(n== 1 || n == 0) {
                return 1;
            }
            int recursionAns = fact(n - 1); //1
            int biggerProblemAns = recursionAns * n; //1
            return biggerProblemAns;
        }

        public static void main(String[] args) {
            System.out.println(fact(5));
        }
    }
}
