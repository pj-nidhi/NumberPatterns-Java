import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no;
		no=sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			System.out.println((i)+""+(i+no)+""+(i+no+no));
		}
	}
		
