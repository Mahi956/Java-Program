import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n =sc.nextInt();
        System.out.println("Enter values of array");
        int[] arr=new int[n];
        int sum=0;

        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        for (int j= 0;j<arr.length;j++){                    
            System.out.print(arr[j]);
        }

        for(int k=0;k<arr.length;k++){
            sum=sum+arr[k];
        }
        System.out.println(" Sum: " +sum);

        int max= arr[0];
        for(int k=1;k<n;k++){
            if (arr[k]>max) {
                max=arr[k];
            }
        }
        System.out.println("Maximum element: " + max);

        for(int k=1;k<n;k++){
            if (arr[k]%2==0) {
                System.out.println("even");
            }else
            {
                System.out.println("odd");
            }
        }
        int min= arr[0];
        for(int k=1;k<n;k++){
            if (arr[k]<min) {
                min=arr[k];
            }
        }
        System.out.println("Minimum element: " + min);

    }
}