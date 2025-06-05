public class Thiskeyword {
    // int age =15;
    // void data(){
    //     System.out.println(this);
    // }
    // public static void main(String[] args) {
    //     Thiskeyword obj =new Thiskeyword();
    //     obj.data();
    //     System.out.println(obj.age);
    // }
    
}

class Student {
    int age ;
    Student(int age){
        this.age=age;
    }
    
    void print(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student std= new Student (8);
        std.print();
    }
}
