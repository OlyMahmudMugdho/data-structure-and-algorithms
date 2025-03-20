
/*
 *           5
 *         /    \
 *        4      6
 *       / \    /  \
 *      2   8  1    7
 *
 * */


public class DepthFirstValueRecursive {

    public static void DepthFirstValue(Node root) {
        if(root == null) return;
        System.out.println(root.value);
        DepthFirstValue(root.left);
        DepthFirstValue(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node two = new Node(2);
        Node six = new Node(6);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node one = new Node(1);
        Node eight = new Node(8);

        root.left = four;
        root.right = six;

        four.left = two;
        four.right = eight;

        six.left = one;
        six.right = seven;

        DepthFirstValue(root);
    }
}


class Node {
    int value;
    Node left;
    Node right;

    Node(int val) {
        this.value = val;
    }

    Node(int val, Node r, Node l) {
        this.value = val;
        this.right = r;
        this.left = l;
    }
}
