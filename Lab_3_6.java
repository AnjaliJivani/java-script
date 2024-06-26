import java.util.Scanner;
public class Lab_3_6{
//     . Read n numbers in an array then read two different numbers, replace 1st
// number with 2nd number in an array and print its index and final array.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean flag=false;
        System.out.println("enter length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter an element in array");
            arr[i]=sc.nextInt();
        }
        int a;
        System.out.println("enter the element you want to replace in array");
        a=sc.nextInt();
        System.out.println("enter the number you want by replace");
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                flag=true;
                System.out.println("the element you want to replace is on index"+i);
                arr[i]=b;

                for(int j=0;j<n;j++){
                    System.out.println("new array is here");
                    System.out.println(""+arr[j]+",");
                }
            }
           
        }
        if(flag==false){
            System.out.println("the element you want to replace is does not exist in array");
        }
       

    }
}