import java.util.*;
public class Array1 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int a=1;
        int temp=0;
        int ignore=-1;
        for(int i=0;i<n;i++) {
            int b = sc.nextInt();
            arr[i]=b;
            if(b!=0) {
                a = a * b;
            }
            else if(b==0){
                temp=1;
                ignore=i;
            }
        }
        //System.out.println(a);
        for(int i=0;i<n;i++){
            if(i!=ignore && temp==0) {
                a = a / arr[i];
                System.out.print(a + " ");
                a = a * arr[i];
            }
            else if(i!=ignore && temp==1){
                System.out.print(0+" ");
            }
            else if(i==ignore && temp==1){
                System.out.print(a+" ");
            }
        }
        sc.close();
    }
}
