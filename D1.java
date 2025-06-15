import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
       int row =scr.nextInt();
       int col =scr.nextInt();
       int [][] number= new int[row][col];
       
       //taking input
       //rows
     for (int i = 0; i <row; i++) {
        //column
        for (int j = 0; j <col; j++) {
            number[i][j]= scr.nextInt();
        }     
     }

     //output
    for (int i = 0; i < row; i++) {
         for (int j = 0; j <col; j++) {
           System.out.println(number[i][j] +" ");
        }   
        System.out.println();
    }

  }
    
}
