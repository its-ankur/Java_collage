import java.util.*;
public class AddWithCarry {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=100;
        for(int i=1;i<n;i=i*10){
            n=n+i;
        }
        System.out.println(n);
    }
}
