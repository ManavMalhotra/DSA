class Node {
    Node left;
    Node right;
    int key;
    public Node(int item){
        key = item;
        left = null;
        right = null;
    }
}
public class NumberTree {
    Node root;
    NumberTree(){
        root = null;
    }
    void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.key + " ");
        inorder(node.right);
    }

//    int getHeight(Node node){
//        int ltree = height(node);
//        int rtree = height(node);
//
//        if (ltree > )
//    }
    void levelOrder(Node node){}
}
