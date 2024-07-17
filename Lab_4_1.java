import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        // 21. Write a program to insert a number at a given location in an array.
        //length
        //array
        //element insert
        //index++
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of arrray8");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element you want to insert");
        int k=sc.nextInt();
        System.out.println("enter indexx  on which you want to insert an element");
        int x=sc.nextInt();
        if((x>n)&&(x<0)){
            System.out.println("enter valid index");
        }
        else{
          
        for(int i=n;i>x;i--){
            arr[i]=arr[i-1];
            
           
        }
        arr[x]=k;
        for(int i=0;i<=(n);i++){
            System.out.println("array"+arr[i]);
        }
        // if(n==x){
              
            //   for(int j=x+1;j<(n+1);j++){
            //     arr[j-1]=arr[j];
            //   }
            //   arr[n]=k;
            // }
        // for(int i=0;i<(y);i++){
        //     System.out.println("arr"+arr[i]);
        // }
        //print 
        // for(int i=0;i<(n+1);i++){
        //    System.out.println(arr[i]);
        // }
        // int p=0;
        // while (p<(n+1)) {
        //     System.out.println(arr[p]);
        //     p++;
            
        // }
    }
    }
    
}
