
public class HourGlass {

	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>=1;i--) {
			for (int k=1; k<=n-i;k++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		for(int m=2;m<=n;m++) {
			for (int k=1; k<=n-m;k++) {
				System.out.print(" ");
			}
			for (int j=1;j<=m;j++) {
				System.out.print("* ");
				}
			System.out.println();
			}

	}

}
