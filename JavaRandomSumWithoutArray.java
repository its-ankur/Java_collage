import java.util.*;
public class JavaRandomSumWithoutArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int w=sc.nextInt();
        int s=sc.nextInt();
        String str=sc.next();
        int r=(n/w)+(n%w);
        int sum=0;
        int first=1;
        if(str.equals("C")) {
            first=s;
            for (int i = first; i <=n; i = i + w) {
                sum = sum + i;
            }
        }
        if(str.equals("R")){
            for(int i=1;i<s;i++){
                first=first+w;
            }
            int k=0;
            for(int i=first;i<=n;i++){
                sum=sum+i;
                if(k==w-1){
                    break;
                }
                k++;
            }
        }
        System.out.println(sum);
    }
}
