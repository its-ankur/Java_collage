package Question1;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> c=new LinkedHashMap<>();
        for(char q:s.toCharArray()){
            c.put(q,c.getOrDefault(q,0)+1);
        }
        for(char a: c.keySet()){
            System.out.print(a+" "+c.get(a)+" ");
        }
        System.out.println();
    }
}
