package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HeapDs {
    public static void main(String[] args) {
        //MaxHeap test
        int [] a = {4,5,6,1,2,3,7};
        int [] a2 = {0, 6, 5, 7, 1, 2, 3, 4 };
        for(int i: a){
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = (a.length/2)-1; i>=0 ; i--) {
            MaxHeap(i,a);

        }
        IntStream stream = Arrays.stream(a);
        stream.forEach(e->{
            System.out.print(e+" ");
        });

    }
    public static void MaxHeap(int i, int [] input){

        int root = i;
        int left = 2*i+1;
        int right = 2*i+2;

        int largest = root;
        if(left<input.length && input[left]>input[largest]) largest = left;
        if(right<input.length && input[right]>input[largest]) largest = right;
        if (largest!=root){
            int temp = input[largest];
            input[largest] = input[root];
            input[root] = temp;
            MaxHeap(largest,input);
        }

    }

}

