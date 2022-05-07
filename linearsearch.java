import java.util.Scanner;
public class linearsearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,5,8,2,4};
        System.out.println("enter the element to be searched");
        int a=sc.nextInt();
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                f=1;
                System.out.println("element found at:"+(i+1));

            }

        }

        if(f==0){
             System.out.println("element not found");
        }
        sc.close();
      
    }

}
