public class kapreka {
    public static void main(String[] arg){
        int n=45;
        int m=n*n;
        int temp=0;
        for(int i=1;i<m;i=i*10){
            int a=m/i;
            int b=m%i;
            if(a+b==n){
                temp=1;
                break;
            }
        }
        if(temp==1){
            System.out.println("It is Kaprekar");
        }
        else if(temp==0){
            System.out.println("It is not Kaprekar");
        }
    }
}
