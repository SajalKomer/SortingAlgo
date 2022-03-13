package dataStructure;

public class BubbleSort {

    public int[] bubbleSort(int[] a) {

        boolean isSorted;
        for (int i =0; i<a.length; i++) {
            isSorted = true;
            for(int j=1; j<a.length-i; j++) {
                if(a[j]<a[j-1]) {
                   swap(a, j, j-1);
                   isSorted = false;
                }
            }
            if (isSorted) return a;
        }
        return a;
    }

    private void swap(int[] array, int index1, int index2){
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
