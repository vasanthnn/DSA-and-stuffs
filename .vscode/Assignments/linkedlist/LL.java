package Assignments.linkedlist;

public class LL {

    private Node head ;
    private Node tail;
     int size;

   public LL(){
        this.size = 0;
       
    }
    
    
    


    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        

        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    void insertlast(int val){
        Node node = new Node(val);
       tail.next = node;
       tail = node;
    }


    void insertpos(int index,int val ){
        Node  node = new Node(val);
        for (int i =1; i < index; i++) {


        }
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");


    }

    private class Node{
         int value;
        private Node next;


        private Node(int value){
            this.value = value;
        }


        private Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    
}
