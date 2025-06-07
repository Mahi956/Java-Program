import java.time.LocalDate;
//import java.util.Date;

public class Date {
    public static void main(String[] args) {
        System.out.println("Today="+ new Date());
		
		LocalDate today =LocalDate.now();
		LocalDate independenceDay =LocalDate.of(1947, 8, 15);
		
		System.out.println("Today:"+ today);
		System.out.println("Independence Day:"+ independenceDay);
		System.out.println("Torrow:"+ today.plusDays(1));
		System.out.println("Next Month:"+ today.plusMonths(1));
		System.out.println("Next Year:"+ today.plusYears(1));
        
    }

}
