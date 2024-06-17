import java.util.Scanner;
public class Lab_1_5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Lab_1_5 f = new Lab_1_5();
        int ans=f.fact(n);
        System.out.println(ans);
    }

    int fact(int n){
    if(n==0||n==1){
        return 1;
    }
    else{
        return fact((n-1))*n;
    }
    
}
}