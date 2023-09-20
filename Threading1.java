import java.lang.Runnable;

class MyThread implements Runnable{
    int sum=0,start,end;
    MyThread(int s,int e){
        start=s;
        end=e;
    }
    public void run(){
        for(int i=start;i<=end;i++)
            sum+=i;
        //System.out.println(sum);
    }
}
public class Threading1 {
    public static void main(String[] args){
        MyThread t0=new MyThread(1,500);
        Thread thread1=new Thread(t0);
        MyThread t1=new MyThread(501,1000);
        Thread thread2=new Thread(t1);
        thread1.start();
        thread2.start();
        //System.out.println(t1.sum);
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t0.sum+t1.sum);
    }
}
