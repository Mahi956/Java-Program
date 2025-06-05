class animal{
    void walk(){
        System.out.println("walk on 4 legs ");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("baarrkkk");
    }
}

class cat extends animal {
    void meow(){
        System.out.println("meowwwww");
    }
    
}

public class hierarchical {
    public static void main(String[] args) {
        dog dog =new dog();
        dog.bark();

        cat cat =new cat();
        cat.meow();
    }
    
}
