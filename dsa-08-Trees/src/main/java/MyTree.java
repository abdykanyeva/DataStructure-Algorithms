import java.util.LinkedList;
import java.util.Queue;

public class MyTree {


    TNode root;

    public MyTree() {
    }


    void insert(int value){

        TNode newNode = new TNode(value);

        if(root==null){
            root=newNode;
            return;
        }
        TNode current = root;
        while(true){

            if(value<= current.value){
                if(current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }
            else{
                if(current.rightChild == null){
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
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
            System.out.print(toVisit.value+", ");
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }

    public boolean contains(int value){
        if(root==null) return false;
        TNode current = root;

        while(current!=null){
            if(value < current.value) current =current.leftChild;
            else if(value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }

    public boolean isLeaf(TNode node){
        return node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(TNode root){
        if(root==null) return;

        //perform visit on root
        if(isLeaf(root)) System.out.print(root.value +", ");
        printLeaves(root.rightChild);
        printLeaves(root.leftChild);


        // Recursively branch left subtree
        // Recursively branch right subtree



    }

    int countLeaves(TNode root){
        if(root == null) return 0;

        if(isLeaf(root)) return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

}
