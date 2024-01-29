public class Insertion {
    public static Node insert(Node root, int value) {
        if (root == null){
            root = new Node(value);
            return root;
        }

        else if(value < root.value) {
           root.left = insert(root.left,value);
        }

        else if (value > root.value) {
            root.right = insert(root.right,value);
        }

        return root;
        
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        insert(root,2);
        insert(root,3);
        insert(root,8);
        System.out.println(root.right.value);
        System.out.println(root.left.right.value);
    }
}
