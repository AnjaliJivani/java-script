import java.util.Scanner;
import java.util.Arrays;
public class Lab_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of names u want to enter in order to arrange them into alfabatic order");
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
       
        for(int  s=0;s<n;s++){
          arr[s]=sc.nextLine();

        }
        Arrays.sort(arr);
        System.out.println("sorted arrays in alphabatical order");
        for (String arrs : arr) {
            System.out.println(arrs);
        }
        // String min=arr[0];
        // // while()
        // for(int  s=0;s<n;s++){
        //    if( arr[s]<min){
        //     min=arr[s];
        //    }
        // }
        // System.out.println("first name"+min);
    }
}
