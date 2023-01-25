import java.util.Scanner;
public class Exception {
	public static void main(String[] args){
		int a, b, result;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two integers : ");
		a= in.nextInt();
		b=in.nextInt();
		try{
			result=a/b;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught : Divison By Zero");
		}
		in.close();
	}
}
