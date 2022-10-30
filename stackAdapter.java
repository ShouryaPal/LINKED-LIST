import java.util.LinkedList;

/**
 * stackAdapter
 */
public class stackAdapter {

    
    public static class LLtoStackAdaper{
        LinkedList<Integer> list;

        public  LLtoStackAdaper(){
            list = new LinkedList<>();
        }
        int  size(){
            return list.size();
        }
        void push(int val){
            list.addFirst(val);
        }
        int pop(){
            return list.removeFirst();
        }
        int top(){
            return list.getFirst();
        }
    }
}