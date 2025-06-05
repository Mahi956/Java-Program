interface  Walkable{
    void walk();
}

interface Runnable{
    void run();
}

class Human implements  Walkable ,Runnable{
    public void walk(){
        System.out.println("Human can walk");
    }

    public void run(){
        System.out.println("Human can run");
    }

}
public class Interface2 {
    public static void main(String[] args) {
        Human obj =new Human();
        obj.walk();
        obj.run();
    }
}
