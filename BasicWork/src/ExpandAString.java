import java.util.*;
public class ExpandAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuilder m=new StringBuilder();
        int i=0;
        while(i<a.length()){
            char c=a.charAt(i);
            i++;
            int count=0;
            while(i<a.length() && Character.isDigit(a.charAt(i))){
                count=count*10+(Integer.parseInt(String.valueOf(a.charAt(i))));
                i++;
            }
            if(count==0){
                count=1;
            }
            for(int j=0;j<count;j++){
                m.append(c);
            }
        }
        System.out.println(m.toString());
    }
}