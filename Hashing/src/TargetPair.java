import java.util.*;
public class TargetPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashSet<Integer> b=new HashSet<>();
        int flag=0;
        for(int i=0;i<n;i++){
            int t=0;
            if(a[i]<=k){
                t=k+a[i];
            }
            else if(a[i]>k){
                t=a[i]-k;
            }
            if(b.contains(t)){
                flag++;
            }
            b.add(a[i]);
        }
        if(flag==0) {
            System.out.println("Not found");
        }
        else{
            System.out.println(flag);
        }
//        for(int i:b){
//            System.out.println(i);
//        }
    }
}
