package CompleteBT;
import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
public class ArrayToCompleteTree {
    private static TreeNode convertArrayToBinaryTree(int[] array,int i){
//        if(array==null || array.length<1){
//            return null;
//        }
//        int n=array.length;
//        TreeNode root=new TreeNode(array[0]);
//        if((2*i)+1<n){
//            root.left.data=(2*i)+1;
//        }
//        if((2*i)+2<n){
//            root.right.data=(2*i)+2;
//        }
        if(i>=array.length){
            return null;
        }
        TreeNode curr=new TreeNode(array[i]);
        curr.left=convertArrayToBinaryTree(array,(2*i)+1);
        curr.right=convertArrayToBinaryTree(array,(2*i)+2);
        return curr;
    }
    private static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        TreeNode root = convertArrayToBinaryTree(array,0);

        System.out.println("In-order traversal of the generated binary tree:");
        printInOrder(root);
    }
}
