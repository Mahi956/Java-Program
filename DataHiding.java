class StudentData{
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		if(name.length()<=2) {
			this.name="Invalid Name ";
		}else {
			this.name=name;
		}
	}
	
	public void setEmail(String email) {
		if(email.indexOf("@")==-1) {
			this.email="Invalid Email";
		}
		else {
			this.email=email;
		}
	}
}

public class DataHiding {

	public static void main(String[] args) {
		StudentData s1= new StudentData();
		s1.setName("aa");
		 s1.setEmail("bb");
		
		System.out.println("Name: " +s1.getName() +",Email: "+ s1.getEmail());
		StudentData s2 = new StudentData();
		s2.setName("sam");
		s2.setEmail("sam@gmail.com");
		
		System.out.println("Name: "+ s2.getName() +", Email: "+ s2.getEmail());
		
		

	}

}
