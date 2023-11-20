package Frequency;
import java.util.Scanner;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(c.containsKey(t)){
                return new int[]{c.get(t),i};
            }
            c.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(k);
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    continue;
                }
                if(a[i]<a[j]){
                    continue;
                }
                if((a[i]-a[j])==k){
                    System.out.println(a[i]+" "+a[j]);
                }
                else{
                    continue;
                }
            }
        }
    }
}
