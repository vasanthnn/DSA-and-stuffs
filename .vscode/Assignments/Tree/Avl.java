package Assignments.Tree;

import Strings.prac;

public class Avl {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;
        
        public Node(int value) {
            this.value = value;
        }

        public int getHeight() {
            return height;
        }

        
    }
    
    public Avl(){

    }
    private Node root;

    public void insert(int val){
        root = insert(root,val);
    }

    private Node insert(Node node, int value) {
       if(node == null){
        node = new Node(value);
        return node;
       }
       if(value < node.value){
            node.left = insert(node.left, value);
       }

       if(value > node.value){
            node.right = insert(node.right, value);
       }
       return rotate(node);
    }

    private Node rotate(Node node) {
    
        return node;
    }

    public void display(){
        display(root,"Root node : ");
    }
    private void display (Node node,String str){
        if(node == null){
            return;
        }
        System.out.println( str + node.value );
        display(node.left,"left child of " + node.value + " : ");
        display(node.right,"right child of " + node.value + " : ");
    }
}
