  
import java.util.function.Function;
import java.util.function.Predicate;

public class New {

	public static void main(String[] args) {
		 Function <String, Integer> StringLength= str -> str.length();
		 System.out.println(StringLength.apply("Java"));

		 Function <String, String> StringUpper= str -> str.toUpperCase();
		 System.out.println(StringUpper.apply("Java"));
		 
		 Predicate<Character> isUpper =n -> Character.isUpperCase(n);
		 System.out.println(isUpper.test('a'));
		 System.out.println(isUpper.test('M'));
		 
		 Predicate<Integer> isEven =n-> n%2 ==0;
		 System.out.println(isEven.test(19));//false
		 System.out.println(isEven.test(20));// true 
		 
		 Predicate<Integer> isOdd =n-> n%2 !=0;
		 System.out.println(isOdd.test(18));//false
		 System.out.println(isOdd.test(11));// true 
		 
	}

}
