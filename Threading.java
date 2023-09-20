import java.lang.Thread;

class MyClass extends Thread{
    long sum;

    // @Override
    public void run(){
        for(long i=0;i<10000000;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
//class MyThread implements Runnable{
//    long sum;
//
//    @Override
//    public void run(){
//        for(long i=0;i<10000000;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//    }
//}


public class Threading {
    public static void main(String[] args) {
        // MyClass t1=new MyClass();
        // t1.start();
        // System.out.println("Akash");

//        MyThread t=new MyThread();
//        Thread thread=new Thread(t);
//        thread.start();
        //t.start();
        MyClass t1=new MyClass();
        t1.start();
        System.out.println("Hello World");
    }
}