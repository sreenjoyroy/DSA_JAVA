package DSA.heaps;
import java.util.*;

class MaxHeap{
    List<Integer> heap ;

    MaxHeap(){
        heap = new ArrayList<Integer>();
    }
    public int peek(){
        if(heap.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return heap.getFirst();
    }
    public MaxHeap(int [] nums){
        int n = nums.length;
        heap = new ArrayList<Integer>();
        for(int num : nums){
            heap.add(num);
        }
        for(int i = n/2 -1 ; i>=0;i--){
            heapify(i);
        }
    }
    public void heapify(int index){
        int size = heap.size();

        while(index < size){
            int largest = index;
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if(leftChildIndex<size && heap.get(leftChildIndex)>heap.get(largest)){
                largest = leftChildIndex;
            }
            if(rightChildIndex<size && heap.get(rightChildIndex)>heap.get(largest)){
                largest = rightChildIndex;
            }
            if(largest!=index){
                Collections.swap(heap,index,largest);
                index = largest;
            }else{
                break;
            }

        }
    }
    public void heapify2(int index,int size){

        while(index < size){
            int largest = index;
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            if(leftChildIndex<size && heap.get(leftChildIndex)>heap.get(largest)){
                largest = leftChildIndex;
            }
            if(rightChildIndex<size && heap.get(rightChildIndex)>heap.get(largest)){
                largest = rightChildIndex;
            }
            if(largest!=index){
                Collections.swap(heap,index,largest);
                index = largest;
            }else{
                break;
            }

        }
    }
    public void sort(){
        for(int i =heap.size()-1;i>=0;i--){
            Collections.swap(heap,0,i);
            heapify2(0,i);
        }
    }
    public void insert(int val){
        heap.add(val);
        int size = heap.size()-1;
        while(size>0){
            int parentIndex = (size - 1)/2;
            if(heap.get(parentIndex)<heap.get(size)){
                Collections.swap(heap,parentIndex,size);
                size = parentIndex;
            }else{
                break;
            }
        }
    }
    public int pop(){
        if(heap.size() == 0){
            return Integer.MAX_VALUE;
        }
        int lastIndex = heap.size()-1;
        heap.set(0,heap.get(lastIndex));
        int val = heap.remove(lastIndex);
        heapify(0);
        return val;
    }
    public void print(){
        for(int i : heap){
            System.out.println(i);
        }
    }
}
public class heap {
    public static void main(String[] args) {
//        MaxHeap mh = new MaxHeap();
//        System.out.println(mh.peek());
//        mh.insert(100);
//        mh.insert(400);
//        mh.insert(80);
//        mh.insert(50);
//        mh.insert(700);
//        System.out.println(mh.peek());
//        System.out.println(mh.pop());
        MaxHeap mh1 = new MaxHeap(new int[]{2,34,234,1345,654,345});
        mh1.print();
        mh1.sort();
        System.out.println("");
        System.out.println("After Sorting:");
        mh1.print();


    }
}
