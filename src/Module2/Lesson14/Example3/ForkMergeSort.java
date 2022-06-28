package Module2.Lesson14.Example3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkMergeSort extends RecursiveTask<int[]> {

    private final int[] array;

    public ForkMergeSort(int[] array){
        this.array = array;
    }

    @Override
    protected int[] compute() {
        if (array.length > 1){
            //SPLIT
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            //RECURSION
            ForkMergeSort leftTask = new ForkMergeSort(left);
            ForkMergeSort rightTask = new ForkMergeSort(right);

            leftTask.fork();
            rightTask.fork();

            right = rightTask.join();
            left = leftTask.join();

            //MERGE
            for (int i  = 0, il = 0, jr = 0; i < array.length; i++){
                array[i] = jr == right.length || (il < left.length && left[il] < right[jr]) ? left[il++] : right[jr++];
            }
        }
        return array;
    }
}



class Run {
    public static void main(String[] args) {
        int maxSize = 1000;
        int low = 0;
        int high = 400;
        int[] arr = new Random()
                                .ints(low, high)
                                .limit(maxSize)
                                .toArray();

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkMergeSort forkMergeSort = new ForkMergeSort(arr);
        arr = forkJoinPool.invoke(forkMergeSort);
        System.out.println(Arrays.toString(arr));
    }
}