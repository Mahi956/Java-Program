import java.util.*;
public class TwoDarray {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		int row = scr.nextInt();
		int colms = scr.nextInt();
		
		int [][] number = new int [row][colms];
		
		//taking input
		
		for(int i =0; i <row ; i++) {
			for(int j= 0 ; j<colms ; j++) {
			number [i][j] = scr.nextInt();
			}
		}
		
		// taking output 
		
		for (int i=0; i<row; i++) {
			for (int j=0 ; j<colms ;j++) {
				System.out.print(number[i][j] +" ");
				
			}
			
		}
	 System.out.println();

	}
}
