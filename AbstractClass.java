abstract class Payment{
    abstract void pay(int a);

    void success(){
        System.out.println("payment Done");
    }
}

class upiPayment extends Payment{
    void pay(int a){
        System.out.println(" pay vi upi" + a);
    }
}
class NetBanking extends Payment{
    void pay (int b){
        System.out.println("pay vi NetBanking " +b);
    }
}

public class AbstractClass {
    public static void main(String[] args){
        Payment obj =new upiPayment();
        obj.pay(36700);
        obj.success();
        Payment obj1 = new NetBanking();
        obj1.pay(4500);
        obj1.success();
    }
    
}


