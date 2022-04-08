import java.util.Scanner;
public class assignment1b{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("The result is "+a+" "+b);
    }
}