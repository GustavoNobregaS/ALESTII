public class ExemploMaxHeap {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(50);

        heap.put(9);
        heap.put(6);
        heap.put(2);
        heap.put(3);
        heap.put(5);
        heap.put(1);
        heap.put(0);
        heap.put(4);
        heap.put(8);
        heap.printArray();

        //Testar essa mesma ordem visualizando passo a passo em http://btv.melezinek.cz/binary-heap.html


        MaxHeap heap2 = new MaxHeap(new int[]{0,4,10,3,5,1, 99, 65, 32});
        heap2.printArray();

        heap2.print();

        heap2.sort();
        heap2.printArray();


        MaxHeap heap3 = new MaxHeap(new int[]{0,4, 10, 3, 5, 1});
        heap3.printArray();
        heap3.sort();

        heap3.printArray();


    }

}
