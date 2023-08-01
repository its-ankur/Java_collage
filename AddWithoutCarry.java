import java.util.*;
public class AddWithoutCarry {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int ne=0;
        int i=1;
        while(n>0){
            a=n%10;
            a=(a+1)%10;
            ne=ne+(a*i);
            i=i*10;
            n=n/10;
        }
        System.out.println(ne);
    }
}
