package InsertionSort.MergeSort;

public class MergeSort {

    public static int[] mergeSort(int[] input){
        int inputLength = input.length;
        if(inputLength <= 1){
            return input;
        }
        int[] leftArray = new int[inputLength/2];
        int[] rightArray = new int[inputLength - inputLength / 2];
        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = input[i];
        }
        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = input[i + inputLength/2];
        }
        return merge(mergeSort(leftArray), mergeSort(rightArray));
    }

    private static int[] merge(int[] leftArray, int[] rightArray){
        int[] mergedArray = new int[leftArray.length + rightArray.length];
        int indexLeft = 0;
        int indexRight = 0;
        for(int i = 0; i < mergedArray.length; i++){
            if(indexLeft >= leftArray.length){
                mergedArray[i] = rightArray[indexRight];
                indexRight++;
            }else if(indexRight >= rightArray.length){
                mergedArray[i] = leftArray[indexLeft];
                indexLeft++;
            }else if(leftArray[indexLeft] <= rightArray[indexRight]){
                mergedArray[i] = leftArray[indexLeft];
                indexLeft++;
            }else{
                mergedArray[i] = rightArray[indexRight];
                indexRight++;
            }
        }
        return mergedArray;
    }
}
