import java.util.*;
public class TwoDArray {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
//        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
//        for(int i=0;i<arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//        }
        for(int []x:arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
        }
    }
}

