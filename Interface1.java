

interface  clint{
    void print ();
    void show();
}

class dev implements clint{
    @Override
    public void print(){
        System.out.println("print the bill");
    }
@Override
    public void show (){
        System.out.println("show the menue");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        dev obj=new dev();
        obj.print();
        obj.show();
    }
}
