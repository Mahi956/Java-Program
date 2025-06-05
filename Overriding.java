    class Vehicle {
        void run(){
            System.out.println(" car ");
        }    
    }
    class Bike extends Vehicle {
        void run(){
            System.out.println(" car is running ");
            super.run();
        }
        
    }

    public class Overriding {
    public static void main(String[] args) {
     Vehicle obj =new Bike();
       obj.run();
   
     
    }
 }
