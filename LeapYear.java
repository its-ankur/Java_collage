import java.util.*;
public class LeapYear {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            if(n%100==0){
                if(n%400==0){
                    System.out.println( n + " is a Leap year. ");
                }
                else {
                    System.out.println(n + " is not a leap year");
                }
            }
            else if(n%4==0){
                    System.out.println(n + " is a leap year");
                }
            else{
                System.out.println(n+" is not a leap year");
            }
    }
}
