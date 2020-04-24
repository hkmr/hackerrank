import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeTraversal {

    public static void main(String[] args) {

        // creating Tree
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);

        root.left.right = new Tree(4);
        root.left.left = new Tree(5);
        root.right.right = new Tree(6);

        // preOrderTraversal(root);
        // inOrderTraversal(root);
        // postOrderTraversal(root);
        // preOrderNonRecursive(root);
        // inOrderTraversal(root);
        levelOrderTraversal(root);

    }

    public static void preOrderTraversal(Tree root) {

        if (root == null)
            return;

        System.out.print(root.val + " ->");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Tree root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.val + "->");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Tree root) {
        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + "->");
    }

    // Non-recursive methods

    public static void preOrderNonRecursive(Tree root) {
        if (root == null)
            return;

        Stack<Tree> stack = new Stack<Tree>();
        Tree tmp = root;

        stack.push(tmp);
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            System.out.print(tmp.val + "->");
            if (tmp.right != null)
                stack.push(tmp.right);
            if (tmp.left != null)
                stack.push(tmp.left);
        }
    }

    public static void inOrderNonRecursive(Tree root) {

        if (root == null)
            return;
        Stack<Tree> stack = new Stack<Tree>();
        Tree tmp = root;

        while (true) {
            while (tmp.left != null) {
                stack.push(tmp);
                tmp = tmp.left;
            }

            while (tmp.right != null) {
                System.out.print(tmp.val + "->");
                if (stack.isEmpty())
                    return;
                tmp = stack.pop();
            }
            System.out.print(tmp.val + "->");
            tmp = tmp.right;
        }

    }

    public static void postOrderNonRecursive(Tree root) {

        // if (root == null)
        // return;

        // Stack<Tree> stack = new Stack<Tree>();
        // Tree tmp = root;

    }

    public static void levelOrderTraversal(Tree root) {

        Tree tmp = root;
        Queue<Tree> q = new LinkedList<Tree>();
        q.add(tmp);
        while (!q.isEmpty()) {
            Tree current = q.remove();
            System.out.print(current.val + "->");
            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);
        }

    }

}

class Tree {
    int val;
    Tree left;
    Tree right;

    Tree(int data) {
        val = data;
    }
}