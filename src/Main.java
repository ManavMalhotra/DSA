import java.util.Stack;

public class Main {
    void buildTree(){
        NumberTree numberTree = new NumberTree();
        numberTree.root = new Node(99);
        numberTree.root.left = new Node(88);
        numberTree.root.right = new Node(109);

        numberTree.root.left.left = new Node(77);
        numberTree.root.right.right = new Node(120);

        numberTree.inorder(numberTree.root);

    }

    public static void main(String[] args) {

        String str = "Hello";
        Stack<Character> st = new Stack<Character>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            st.push(chars[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = st.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + new String(chars));


    }
}