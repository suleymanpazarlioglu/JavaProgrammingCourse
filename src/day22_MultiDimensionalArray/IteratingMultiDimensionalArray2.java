package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][] array={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }
}
