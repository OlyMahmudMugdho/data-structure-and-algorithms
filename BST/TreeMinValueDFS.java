import java.util.Stack;

public class TreeMinValueDFS {

    public static int min(Node root) {
        int min = root.value;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.value <= min) {
                min = current.value;
            }

            if (current.left != null) {
                stack.push(current.left);
            }

            if(current.right != null) {
                stack.push(current.right);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.right = six;

        System.out.println(min(root));
    }
}
