public class StringImplementation {
    public static void main(String[] args) {
        //String str1="Ankur";   string literal
        //String str2=new String("Ankur");   string object
        //String in java are immutable
       str();
    }

    static void str(String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
