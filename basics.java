/**
 * basics
 */
public class basics {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void adddata(int value){
            Node temp =new Node();
            temp.data = value;
            temp.next = null;
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;                       
                tail=temp;
            }
            size++;
        }
        public int size(){
            return size;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }
        public void removeFirst(){
            if(size==0){
                System.out.println("Empty Linkedlist");
            } else if(size==1){
                head = tail = null;
                size = 0;
            }else{
                head =head.next;
                size--;
            }
        }
        public int getFirst(){
            if(size==0){
                System.out.println("Empty List");
                return -1;
            }else{
                return head.data;
            }
        }
        public int getLast(){
            if(size==0){
                System.out.println("Empty List");
                return -1;
            }else{
                return tail.data;
            }

        }
        public int getAt(int ind){
            if(size==0){
                System.out.println("Empty List");
                return -1;
            }else if(ind<0 || ind>=size){
                System.out.println("Given Index is not there");
                return -1;
            }else{
                Node temp = head;
                for(int i=0;i<ind;i++){
                    temp = temp.next;       
                }
                return temp.data;
            }
        }
        public void assignFirst(int value){
            Node temp = new Node();
            temp.data = value;
            temp.next = head;
            head = temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }
        public void addat(int ind,int value){
            if(ind<0||ind>size){
                System.out.println("Not an appropriate index");
            }else if(ind == size){
                adddata(value);
            }
            else if(ind==0){
                assignFirst(value);
            }else{

                Node node = new Node();
                node.data = value;
                
                Node temp = head;
                for(int i=0;i<ind-1;i++){
                    temp = temp.next;
                }
    
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }
        public void removeLast(){
            if(size==0){
                System.out.println("Empty Linkedlist");
            } else if(size==1){
                head = tail = null;
                size = 0;
            }else{
                Node temp = head;
                for(int i=0;i<size-2;i++ ){
                    temp = temp.next;
                }
                temp = tail;
                temp.next = null;
                size--;        
            }
        }
        private Node getNode(int inx){
            Node temp = head;
                for(int i=0;i<inx;i++){
                    temp = temp.next;       
                }
                return temp;
        }
        public void reverse(){
            int li=0;
            int ri = size-1;
            while(li<ri){
                Node left  = getNode(li);
                Node right = getNode(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }
        public void reversepointer(){
            Node previous = null;
            Node current = head;
             while(current != null){
                Node ocn = current.next;
                current.next = previous;
                previous = current;
                current = ocn;
             }
             Node temp =    head;
             head = tail;
             tail = temp;
        }
        public void removeAt(int indx){
            if(indx<size|| indx >=size){
                System.out.println("Invalid Argument");
            }
            else if(indx==0){
                removeFirst();
            }
            else if(indx == size-1){
                removeLast();
            }
            else{
                Node temp = head;
                for(int i=0;i<indx-1;i++){
                    temp = temp.next;
                }
                temp = temp.next.next;
                size--;
            }
        }
        public int kthElement(int k){
            Node s = head;
            Node f = head;
            for(int i=0;i<k;i++) f = f.next;
            while(f!=null){
                s=s.next;
                f=f.next;
            }
            return s.data;
        }
        public int mid(){
            Node s = head;
            Node f = head;
            while(f.next!=null&&f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            return s.data;
        }
        public LinkedList mergetSorted(LinkedList l1,LinkedList l2){
            Node one = l1.head;
            Node two = l2.head;
            
            LinkedList res = new LinkedList();
            
            while(one !=null && two != null) {
                if(one.data<two.data){
                    res.adddata(one.data);
                    one = one.next;
                }else{
                    res.adddata(two.data);
                    two = two.next;  
                } 
            }
            while(one !=null) {
                res.adddata(one.data);
                one = one.next;
                
            }
            while(two != null) {
                res.adddata(two.data);
                two = two.next;  
            }
            return res;
        }
    }
}
