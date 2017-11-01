import java.util.Scanner;
public class SumOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		Scanner in =new Scanner(System.in);
		System.out.println("Please key in the first number for addition");
		x=in.nextInt();
		System.out.println("Please key in the second number for addition");
		y=in.nextInt();
		
		while(y!= 0){			
		int Addition = x & y;
		
		x = x ^ y;
		
		y= Addition << 1;
		}
		System.out.println("Sum:" + x);
		
		
		

	}

}
