import java.util.Scanner;
public class binarysearch{
     static void binarysearch(int arr[],int x){
        int start,end;
        start=0;
        end=arr.length-1;
        int k=0;
        int pos=0;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==x){
                //System.out.println("elemnt found at index,"+mid);
                k=1;
                pos=mid;
                break;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(k==1){
            System.out.println("element found at:"+(pos+1));
        }
        else{
            System.out.println("element not found!");
        }      
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={10,16,34,78,100};
        int a=0;
        System.out.println("enter the element to be searched");
        a=sc.nextInt();
        binarysearch(arr,a);
    }
}

