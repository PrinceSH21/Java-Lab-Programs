import java.util.Scanner;
public class Quad{
    public static void main(String args[]) {
        double a,b,c,d,r1,r2;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the coefficients of a , b and c: ");
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();
        d=b*b-(4*a*c);
        if(d==0){
            System.out.print("Roots are real and Equal \n");
            r1=r2=-b/(2*a);
            System.out.printf("Roots are "+r1+ " and "+r2);
        }
        else if(d>0){
            r1=(-b+Math.sqrt(d)/2*a);
            r2=(-b-Math.sqrt(d)/2*a);
            System.out.println("Roots are real and distinct .");
            System.out.println("Roots are "+r1+" and "+r2);
        }
        else{
            System.out.println("Roots are complex and imaginary.");
        }
    }
}