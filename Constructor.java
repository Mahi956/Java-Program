 class Student {
    String firstname="Aditya";
    int age=26;

    Student(){
        System.out.println("hello");
    }

    Student(String firstname){
        this();
        System.out.println(firstname);
    }

    Student(String firstname, int age){
        this(firstname);
        this.firstname=firstname;
        age=age;

       // System.out.println(firstname +" " + age);
    }
}
 
public class Constructor{
    public static void main(String[] args) {
        Student obj =new Student("Mahi", 18);
        Student obj1 =new Student("Manu", 19);

        System.out.println(obj.firstname);
        System.out.println(obj1.age);

    }

    
}
