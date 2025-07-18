package src.Heap;

public class MyHeap {
    int heapSize;
    int heap[] ;
    int capacity;

     MyHeap(int arr[]) {
         heap = arr;
         heapSize = arr.length;
         capacity =arr.length;

    }
    public  void swap(int i , int j){
         int temp = heap[i];
         heap[i]  = heap[j];
         heap[j] = temp;
    }
    public void heapify(int index){
        int largest = index;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        if (leftChildIndex < heapSize && heap[leftChildIndex] > heap[largest]) {
            largest = leftChildIndex;
        }
        if (rightChildIndex < heapSize && heap[rightChildIndex] > heap[largest]) {
            largest = rightChildIndex;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    public int extractMax(){
         if (heapSize == 0) {
             System.out.println("Heap is Empty ");
             return -1;
         }
         int max =heap[0];// In max heap max element is stored at the root
        heap[0] = heap[heapSize-1];
        heapSize--;//delete the last node
        heapify(0);
        return max;
    }

    public void buildTree(){
         // N/2 to N-1
        // non-leaf node -> 0 to (N/2-1)
        for(int index= heapSize/2-1;index >=0 ;index-- ){
            heapify(index);
        }

    }
    public void increaseKey(int index,int newValue){
         if (index <0 || index >= heapSize || heap[index] >= newValue) {
             System.out.println("Enter correct operation");
             return;
         }
         heap[index] = newValue;
         while (index >0 && heap[index] > heap[(int) (Math.ceil(index/2.0)-1)]){
             swap(index,(int) (Math.ceil(index/2.0)-1));
             index =(int) (Math.ceil(index/2.0)-1);
         }

    }public void decreaseKey(int index,int newValue){
         if (index <0 || index >= heapSize || heap[index] <= newValue) {
             System.out.println("Enter correct operation");
             return;
         }
         heap[index] = newValue;
         heapify(index);
    }
    public void printTree(){
         for (int i = 0; i<heapSize;i++){
             System.out.print(heap[i] + " ");
         }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,4,30,7,11};

            MyHeap  myHeap= new MyHeap(arr);
            myHeap.buildTree();
            myHeap.printTree();
//          int res =   myHeap.extractMax();
//        System.out.println("MAX ELEMENT EXTRACT : "+res);
        myHeap.printTree();
        System.out.println("After increasing the value of the index");
        myHeap.increaseKey(3,13);
        myHeap.printTree();
        myHeap.decreaseKey(0,3);
        myHeap.printTree();
    }
}
