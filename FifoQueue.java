import java.util.LinkedList;

class FifoQueue {
    private LinkedList queue = new LinkedList<>();

    public Object pop() throws Exception{
        if(queue.size()>0){
            Object retEl = queue.getFirst();
            queue.removeFirst();
            return retEl;
        } else {
            throw new Exception("Queue is Empty");
        }
    }

    public void push(Object element){
        queue.addLast(element);
    }

    // public static void main(String[] args) throws Exception {
    //     FifoQueue fq = new FifoQueue();
        // String text = "rf";
        // int number = 2;
        // fq.push(number);
        // fq.push(text);
    //     System.out.println(fq.pop());
    // }
}