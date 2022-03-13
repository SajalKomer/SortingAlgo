package dataStructure;

public class InsertionSort {

    public void insertionSort1(int[] array){
        for(var i=0; i<array.length; i++){
            var current = array[i];
            var j = i-1;
            while(j>= 0 && array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
    }

    public void insertionSort2 (int[] array) {
        for (var i=0; i<array.length; i++){
            var j=i-1;
            while(j>=0 && array[j]>array[i]){
                swap(array, j, i);
                j--;
                i--;
            }
        }
    }

    private void swap (int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
