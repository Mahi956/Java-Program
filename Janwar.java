abstract class Animal{
    abstract void sound();

        void Makesound(){
            System.out.println("Cat and Dog says: ");
        }
    
}

class dog extends Animal{
    void sound(){
        System.out.println(" bhaww");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println(" meoww");
    }
}

public class Janwar {
    public static void main(String[] args) {
        Animal obj =new cat();
        obj.Makesound();
        obj.sound();
        Animal obj1 =new dog();
        obj1.sound();
    }
    
}
