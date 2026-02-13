package DSA.heaps;
import java.util.*;

public class heap_imp {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        ///[28,34,12,78,23]
        minHeap.add(28);
        minHeap.add(34);
        minHeap.add(12);
        minHeap.add(78);
        minHeap.add(23);

        maxHeap.add(28);
        maxHeap.add(34);
        maxHeap.add(12);
        maxHeap.add(76);
        maxHeap.add(23);

        System.out.println(maxHeap.peek());
        System.out.println(minHeap.peek());

        maxHeap.poll();
        minHeap.poll();

        System.out.println("After polling the maxheap : " + maxHeap.peek());
        System.out.println("After Polling the minheap : " + minHeap.peek());

        System.out.println("After Polling the maxheap size is "+maxHeap.size());

        maxHeap.poll();
        maxHeap.poll();
        maxHeap.poll();
        maxHeap.poll();

        System.out.println(maxHeap.isEmpty());
        System.out.println(minHeap.isEmpty());

        //using heapify
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>(Arrays.asList(28,34,12,78,23));
        System.out.println(minHeap2.peek());
        minHeap2.poll();
        System.out.println("After Polling : " + minHeap2.peek());
    }
}
