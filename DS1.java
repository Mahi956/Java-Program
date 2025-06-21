import java.util.*;
public class DS1 {

	public static void main(String[] args) {
	
		ArrayList obj1 =new ArrayList();
		obj1.add("abc");
		obj1.add(10);
		
		ArrayList<String> obj2 =new ArrayList<String>();
		obj2.add("abc");
		 // obj.add(10);
		
		List<String> obj3 =new ArrayList<String>();
		obj3.add("abc");
		obj3.add("abcd");
		obj3.add("abd1");
		obj3.add("abc2");
		
		Object[] data = obj3.toArray();
		
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println("***********");
	
		for(Object o : data) {
			System.out.println(o);
		}System.out.println("*********");
		
		Iterator<String>it = obj3.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***********");
		
		for(String s:obj3) {
			System.out.println(s);
		}

	}
}
