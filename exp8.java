import java.util.Random;
import java.util.Scanner;
class squarethread implements Runnable{
    int x;
    squarethread(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("Thread Name : Square Thread and Square of "+x+" is : "+x*x);
    }
}
class cubethread implements Runnable{
    int x;
    cubethread(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("Thread Name : Cube Thread and Cube of "+x+" is : "+x*x*x);
    }
}
class Randomthread implements Runnable{
    Random r;
    Thread t2,t3;
    public void run(){
        int num;
        r=new Random();
        try{
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number of random numbers : ");
            int n=in.nextInt();
            System.out.println();
            for (int i=0;i<n;i++){
                num=r.nextInt(100);
                System.out.println("Main thread & Generated number is : "+num);
                t2=new Thread(new squarethread(num));
                t2.start();
                t3=new Thread(new cubethread(num));
                t3.start();
                Thread.sleep(1000);
                System.out.println("-------------------");
            }
        }
        catch(Exception e){
            System.out.println("Interrupted Exception..");
        }
    }
}
public class exp8 {
    public static void main(String[] args){
        Randomthread obj=new Randomthread();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
