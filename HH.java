import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name) {
        this.age=age;
        this.name=name;
    }
    public  String toString(){
        return age+ " " + name;
    }
    public  int compareTo(Student s){
        return this.age-s.age;

    }
    

}
public class HH{
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student(17, "rahul"));
        list.add(new Student(16, "rohit"));
        list.add(new Student(11, "mohit"));
        list.add(new Student(51, "om"));

           Collections.sort(list);
           for(Student s :list){
            System.out.println(s.toString());
        }
    }
}