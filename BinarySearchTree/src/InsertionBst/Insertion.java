package InsertionBst;
import java.util.*;
public class Insertion {
    public static class Node {
        public int key;
        public Node left;
        public Node right;
    }
    public static Node newNode(int data)
    {
        Node temp = new Node();
        temp.key = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static Node insert(Node root, int key)
    {
        Node newnode = newNode(key);
        Node x = root;
        Node y = null;
        while (x != null) {
            y = x;
            if (key < x.key)
                x = x.left;
            else
                x = x.right;
        }
        if (y == null)
            y = newnode;
        else if (key < y.key)
            y.left = newnode;
        else
            y.right = newnode;
        return y;
    }
    public static void Inorder(Node root)
    {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.key + " ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root, 30);
        insert(root, 18);
        insert(root, 45);
        insert(root, 10);
        insert(root, 42);
        insert(root, 67);
        Inorder(root);
    }
}
