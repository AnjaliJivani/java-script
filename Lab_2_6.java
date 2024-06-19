import java.util.Scanner;

public class Lab_2_6 {
    public static void main(String[] args) {
        // 11. WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print the series :  1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.print(+sum+",");
        }
    }
}
