<<<<<<< HEAD
public class palendrom {
    public static void main(String[] args) {
        int a=678;
        int original=a;
        int res=0;

        while (a>0) {
            int digit=a%10;
            res=res*10+digit;
            a=a/10;   
        }

        if (original==res) {
            System.out.println(" Number is palendrome");
        }
        else{
            System.out.println("Number is not palendrome");
        }
    }
    
}
=======
public class palendrom {
    public static void main(String[] args) {
        int a=678;
        int original=a;
        int res=0;

        while (a>0) {
            int digit=a%10;
            res=res*10+digit;
            a=a/10;   
        }

        if (original==res) {
            System.out.println(" Number is palendrome");
        }
        else{
            System.out.println("Number is not palendrome");
        }
    }
    
}
>>>>>>> 15be7e0 (Initial commit)
