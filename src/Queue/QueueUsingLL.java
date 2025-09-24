package Queue;

public class QueueUsingLL {
    Node head=null;
    Node tail=null;

    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
        public boolean isEmpty() {
            return head == null;
        }

        public void add(int val) {
            Node newNode = new Node(val);
            if (isEmpty()) {
                head = newNode;
                tail = head;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) return -1;
            int font = head.data;

            if (head.next == null) {
                head = null;
                tail = null;
                return font;
            }
            head = head.next;
            return font;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    }

