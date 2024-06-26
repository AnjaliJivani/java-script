import java.util.Scanner;

public class Lab_3_5 {
 public static void main(String[] args) {
    // . Write a program to find whether the array contains a duplicate number or not.
    Scanner sc =new Scanner(System.in);
    System.out.println("enter length of array");
    int n=sc.nextInt();
    int a[] = new int[n];
    
    for(int i=0;i<n;i++){
        System.out.println("enter an elemet to array");
        a[i]=sc.nextInt();
       
    }
    int dup=a[0];
    for(int j=a[0];j<a.length;j++){
        //  if(j==a[j]){
        //     System.out.println("duplicate"+a[j]);
        //  }
    }

 }   
}
