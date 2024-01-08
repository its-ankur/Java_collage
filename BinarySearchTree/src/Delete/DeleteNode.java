package Delete;
import InsertionBst.Insertion;
import static InsertionBst.Insertion.Inorder;
import static InsertionBst.Insertion.insert;
public class DeleteNode {
    public static Insertion.Node delete(Insertion.Node root, int key){
        if (root == null)
            return root;
        if (root.key > key) {
            root.left = delete(root.left, key);
            return root;
        } else if (root.key < key) {
            root.right = delete(root.right, key);
            return root;
        }
        if (root.left == null) {
            Insertion.Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Insertion.Node temp = root.left;
            return temp;
        }
        else {
            Insertion.Node succParent = root;
            Insertion.Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
            root.key = succ.key;
            return root;
        }
    }
    public static void main(String[] args) {
        Insertion.Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);
        root=delete(root,70);
        Inorder(root);
    }
}
