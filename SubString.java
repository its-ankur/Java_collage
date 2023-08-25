public class SubString {
    public static void main(String[] args) {
        String str="Hello";
        str='Y'+str.substring(1);
        //str=str.substring(1,str.length()-1)+'w';
        str+='w';
//        String str1=str.substring(str.length()-1);
//        String str2=str.substring(0,1);
//        str=str1+str.substring(1,str.length()-1);
//        str+=str2;
        str=str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
        System.out.println(str);
    }
}
