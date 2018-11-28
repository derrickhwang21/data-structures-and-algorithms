import java.util.Arrays;


public class ArrayShift{
    public static void main (String[] args){

        int[] testArray1 = {1,2,3,4,5,6};
        int[] testArray2 = {1,2,3,5,24};
        int[] testArray3 = {12,4,5,6};

        int testValue = 3;

        System.out.println("Add middle index:");
        System.out.println("Original Array: " + Arrays.toString(testArray1) + " New Array: " + Arrays.toString(insertShiftArray(testArray1, testValue)));
        System.out.println("Original Array: " + Arrays.toString(testArray2) + " New Array: " + Arrays.toString(insertShiftArray(testArray2, testValue)));
        System.out.println("Original Array: " + Arrays.toString(testArray3) + " New Array: " + Arrays.toString(insertShiftArray(testArray3, testValue)));
        System.out.println("");
        System.out.println("Remove middle index:");
        System.out.println("Original Array: " + Arrays.toString(testArray1) + " New Array: " + Arrays.toString(removeShiftArray(testArray1)));
        System.out.println("Original Array: " + Arrays.toString(testArray2) + " New Array: " + Arrays.toString(removeShiftArray(testArray2)));
        System.out.println("Original Array: " + Arrays.toString(testArray3) + " New Array: " + Arrays.toString(removeShiftArray(testArray3)));
    }

    public static int[] insertShiftArray (int[] originalArray, int inputValue){
        int[] newArray = new int[originalArray.length + 1];
        int midpointIndex = (originalArray.length % 2 == 0 ? originalArray.length / 2 : (originalArray.length + 1) / 2);

        for (int i = 0; i < newArray.length; i++) {
            if (i < midpointIndex){
                newArray[i] = originalArray[i];
            }
            else if (i == midpointIndex){
                newArray[i] = inputValue;
            }
            else {
                newArray[i] = originalArray[i - 1];
            }
        }
        return newArray;
    }

    public static int[] removeShiftArray (int[] originalArray){
        int[] middlelessArray = new int[originalArray.length - 1];
        int midpointIndex = (originalArray.length % 2 == 0 ? originalArray.length / 2 : (originalArray.length + 1) / 2);

        for (int i = 0; i < middlelessArray.length; i++){
            if (i < midpointIndex) {
                middlelessArray[i] = originalArray[i];
            }
            else {
                middlelessArray[i] = originalArray[i + 1];
            }
        }
        return middlelessArray;
    }
}
