import java.util.*;
public class JavaRandomSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int w=sc.nextInt();
        int r=(n/w)+n%w;
        //System.out.println(r);
        int[][] arr=new int[r][w];
        int q=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<w;j++){
                if(q<=n){
                arr[i][j]=q;
                q++;
                }
                else if(q>n){
                    break;
                }
            }
        }
        int s= sc.nextInt();
        String str= sc.next();
        int sum=0;
        if(str.equals("R")){
            for(int i=0;i<w;i++){
                sum=sum+arr[s][i];
            }
        } else if (str.equals("C")) {
            for(int i=0;i<r;i++){
                sum=sum+arr[i][s];
            }
        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<w;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(sum);
    }
}
