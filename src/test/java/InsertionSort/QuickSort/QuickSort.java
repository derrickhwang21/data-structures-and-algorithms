package InsertionSort.QuickSort;

public class QuickSort {

    public int pivot(int[] inputArray, int left, int right){
        int pivotElement = inputArray[left];
        while(left <= right){
            while(inputArray[left] < pivotElement)
                left++;
            while(inputArray[right] > pivotElement)
                right--;
            if(left <= right){
                int placeHolder = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = placeHolder;
                left++;
                right--;
            }
        }
        return left;
    }

    public void quickSort(int[] inputArray, int smallIndex, int largeIndex){
        int index = pivot(inputArray, smallIndex, largeIndex);
        if(smallIndex < index - 1){
            quickSort(inputArray, smallIndex, index - 1);
        }
        if(largeIndex > index){
            quickSort(inputArray, index, largeIndex);
        }
    }
}
