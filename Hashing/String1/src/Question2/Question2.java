package Question2;

import java.util.HashMap;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> c=new HashMap<>();
        for(char q:s.toCharArray()){
            c.put(q,c.getOrDefault(q,0)+1);
        }
        int max=0;
        for(Character a:c.keySet()){
//            int a=c.get(q);
//            System.out.println(q+" "+a)
            if(c.get(a)>max){
                max=c.get(a);
            }
        }
        for(char a:s.toCharArray()){
            Integer b=c.get(a);
            if(b==max){
                System.out.println(a+" "+max);
                break;
            }
        }
    }
}
