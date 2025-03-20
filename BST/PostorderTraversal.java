public class PostorderTraversal {

    public static void traverse(Node root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        traverse(root.right);
        System.out.println(root.value);
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);

        traverse(root);
    }
}
