import java.util.LinkedList;
import java.util.Queue;

// import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Binary {
    static int idx = -1;
    public static Node buildTree(int arr[]){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        // System.out.println(newNode.data);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        
        return newNode;
    }

    // D.F.S -->
    public static void preOrder(Node root){
        if(root == null){
            System.out.print("null ");
            return;
        }
        System.out.println("\n"+root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println("\n"+root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println("\n"+root.data);
    }

    // B.F.S --> 
    public static void levelOrder(Node root){

        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,10,11,12,-1,-1,-1,13,-1,-1,2,9,-1,-1,3,4,-1,-1,5,7,-1,-1,6,-1,-1};
       
        Node root = buildTree(arr);

        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        levelOrder(root);
    }
    
}
