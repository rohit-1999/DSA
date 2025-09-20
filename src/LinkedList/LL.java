package LinkedList;


public class LL {

    Node head;

    class Node{
        int data;
        Node next;

    }

    public void add(int data){
            Node node =new Node();
        node.data=data;
           node.next =head;
           head=node;
    }
    public void printLL() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
        void deleteFirst() {
            if(head==null){
                System.out.print("list is empty");
            }
            else
            {head=head.next;}
        }

      void deletLast(){
          if (head == null) {               // empty list
              System.out.println("List is empty");
              return;
          }

          if (head.next == null) {          // only one node
              head = null;
              return;
          }
        Node node = head ;
          Node secondLast = node;
        while(node!=null){
            node=node.next;
        }
        secondLast.next=null;
      }
      int size(){
        if(head==null) return 0;
        int count=0;
        Node node =head;
             while(node!=null){
                 count++;
                 node =node.next;
             }
             return count;
      }
      public void reverseLL(){
        if(head==null || head.next==null) {return;}
        Node prevNode = head;
        Node currentNode = prevNode.next;
        while(currentNode!=null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            //update
            prevNode=currentNode;
            currentNode = nextNode;

        }
          head.next=null;
        head =prevNode;


      }
    }

