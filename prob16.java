public class prob16 {
    public static void main(String[] args) {
        System.out.println("look here");
        Thread t1 = new Thread(()->{
            System.out.println("hii");
        });
        Thread t2 = new Thread(()->{
            System.out.println("Hello");
        });
        t1.start();
        t2.start();
    }
    
}
