package cheers.tdd.collection;

import java.util.*;

public class CollectionUtil {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set = Collections.unmodifiableSet(set);

        Set<String> set2 = new TreeSet<String>();
        set2.add("2");
        set2.add("1");

        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        System.out.println(stack.pop());

        for(Iterator<String> iterator = set.iterator();iterator.hasNext();){
            System.out.print(iterator.next()+" ");
        }

        LinkedList linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        System.out.println(linkedList.get(0));

        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

        String[] stringArray = new String[]{"A", "B", "C"};
        System.out.println(stringArray[2]);

        List list = new ArrayList();
        list.add("ABC");
        list.add(123);

//        List list2 = Collections.synchronizedList(new LinkedList());
//        list2.add("")

    }

}
