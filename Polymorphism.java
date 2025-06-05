class parent {
    void sum(int a){
        System.out.println(a);
    }
    void sum (int a,int b){
        System.out.println(a+b);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
       parent obj =new parent();
       obj.sum(12, 45);
    }
}
