import java.util.Scanner;

public class Lab_2_5 {
    public static void main(String[] args) {
//         0. WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1 
// week and 3 days].
      Scanner sc = new Scanner(System.in);
      System.out.println("enter nuber of days");
      int  noOfDays=sc.nextInt();
      int year=0;
      while(noOfDays>364){
        noOfDays=noOfDays-365;
        year++;
      }
      System.out.println(" no of years :"+year);
      int week=0;
      while(noOfDays>7){
       noOfDays=noOfDays-7;
       week++;

      }
      System.out.println("no of weeks :"+week);
      System.out.println("years :"+year+" weeks :"+week+" days :"+noOfDays);


    }
}
