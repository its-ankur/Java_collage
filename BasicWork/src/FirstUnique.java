public class FirstUnique {
    public static void main(String[] args) {
        String str="abcdabdf";
        for(int i=0;i<str.length()-1;i++){
            for(int j=1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
