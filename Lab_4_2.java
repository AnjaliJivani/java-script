import java.util.Scanner;

public class Lab_4_2 {
    public static void main(String[] args) {
        // Write a program to delete a number from a given location in an array.
        //length of array
        System.out.println("enter length of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //array declare
        int arr[]=new int[n];
        //array scan
       for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
       }
       //array print
    //    System.out.println("array");
    //    for(int i=0;i<n;i++){
    //     System.out.print(""+arr[i]);
    //    }
       //index of elemrnt you want to delete
       System.out.println("enter location of the number you want to delete in array");
       int k=sc.nextInt();
       if(k<0||k>n){
        System.out.println("enter valid position");
       }
       else{
        for(int i=k;i<(n-1);i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.println("new array element : "+arr[i]);
        }
       }
       

    }
}
