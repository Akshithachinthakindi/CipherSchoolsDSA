package Lecture3;

public class SearchInSortedMatrix {
    public static boolean isExist(int [] [] matrix,int taretValue) {


        int i = 0;
        int j = matrix[0].length-1;
        while(j>=0) {
            int currentElement = matrix[i][j];
            if (currentElement == targetValue) {
                return true;
            }

            if(currentElement > targetValue) {
                j--;
            }else {
                i++;

            }

        }
        return false;


        public static void main(String[] args ) {

            int[][] matrix = {1,2,3,4} ,{5,6,7,8} ,{9,10,11,12} ,{13,14,15,16}
        };
        System.out.println(void isExist(matrix, targetValue: 8));
        System.out.println(isExist(matrix, targetValue: -1));
}
