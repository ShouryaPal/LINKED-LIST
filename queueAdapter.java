import java.util.LinkedList;
/**
 * queueAdapter
 */
public class queueAdapter {
    public static class LLtoQueueAdaper{
        LinkedList<Integer> list;

        public  LLtoQueueAdaper(){
            list = new LinkedList<>();
        }
        int  size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
        }
        int remove(){
            return list.removeFirst();
        }
        int peak(){
            return list.getFirst();
        }
    }
    
}