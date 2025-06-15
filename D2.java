public class D2 {
    public static void main(String[] args) {
        
        int[][] arr= new int [3][3];
        int num [][] ={{1 , 2 , 5}, 
                       {9 , 8 , 7},
                       {9 , 6 , 2}
                };
             for(int i =0; i <num.length;i++){
              for(int j=0; j<num.length;j++){
                    System.out.print(num[i][j]+" ");
                }
                System.out.println();
             }  


       //System.out.println(num[1][2]);
    }
}
