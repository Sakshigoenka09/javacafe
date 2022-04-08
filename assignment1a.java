import java.util.Scanner;
public class assignment1a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter both the numbers");
        float a=sc.nextFloat();
        float b =sc.nextFloat();
        float c=a*b;
        System.out.printf(" The result is %.3f",c);
    }
}