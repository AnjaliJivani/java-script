import java.util.Scanner;

public class Lab_2_4 {
    public static void main(String[] args) {
//         9. WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS 
// [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)]
    Scanner sc=new Scanner(System.in);
    System.out.println("enter seconds to convert it into hours , minutes,and seconds :");
    int seconds = sc.nextInt();
    int counthour=0;
    while(seconds>3600){
        seconds=seconds-3600;
        counthour++;
    }
    System.out.println("hour  :"+counthour);
    int minutes=0;
    while(seconds>59){
        seconds=seconds-60;
        minutes++;
    }
    System.out.println("minutes :"+minutes);
    System.out.println("seconds :"+seconds);
    System.out.println(+counthour+" hours ,"+minutes+" minutes ,"+seconds+" seconds");
    }
    
}
