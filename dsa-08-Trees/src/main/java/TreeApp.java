import java.util.LinkedList;
import java.util.Queue;

public class TreeApp {

    public static void main(String[] args) {


        MyTree tree = new MyTree();
        int []numbers = new int[]{10, 5, 12, 3, 6, 11, 13, 2};

        for (int i = 0; i < 8; i++) {
            tree.insert(numbers[i]);



        }
        VisualizeTree.printTree(tree.root, null, false);



    }


    // PreOrder Traversal of the tree
    // Root-left-right

    void preOrderTraversal(TNode root){

        if(root==null) return;
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);

    }

    void inOrderTraversal(TNode root){
        if(root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value + " , ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root){
        if(root ==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value + " ");
    }

    void levelOrderTraversal(TNode root){

        if(root==null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TNode toVisit = queue.poll();
            System.out.println(toVisit.value+", ");
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }

}
