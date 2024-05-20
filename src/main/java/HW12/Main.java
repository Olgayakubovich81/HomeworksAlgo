package HW12;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(13);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(3);

        System.out.println("Is BST: " + tree.isValidBST(tree.root)); // false

        tree.recoverTree(tree.root);

        System.out.println("Is BST after recovery: " + tree.isValidBST(tree.root)); // true
    }
}



