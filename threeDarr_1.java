public class threeDarr_1 {
    public static void main(String[] args) {
        
        int [][][] arr= {
            {
                {1,5,2},
                {3,5},
                {1}
            },
            {
                {9,5},
                {5},
                {6,4,2}

            }

        };

        System.out.println("Three-D Array Elements:");

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println(); // Move to the next line after each row
            }
           System.out.println(); // Add a blank line between layers
        }

    }
    
}
