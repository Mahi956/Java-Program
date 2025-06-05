   class animal{
        void eat(){
        System.out.println("eatinggg");
        }
    }
    

    class dog extends animal{
        void bark(){
         System.out.println("barkkk");
        }
    }

    class puppy extends dog{
        void lazy(){
            System.out.println("cutieeee");
        }
       }
    
    public class Inehitance {
    public static void main(String[] args) {
        // dog obj = new dog();
        puppy obj =new puppy(); 
        obj.bark();
        obj.eat();
        
        obj.lazy();
    }
}
