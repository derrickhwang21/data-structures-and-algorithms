

import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        int[] testArray1 = {4,8,15,16,23,42};
        int[] testArray2 = {11,22,33,44,55,66,77};
        int[] testArray3 = {};

        int testKey1 = 15;
        int testKey2 = 90;
        int testKey3 = 90;

        int expectedOutPutTest1 = 2;
        int expectedOutPutTest2 = -1;
        int expectedOutPutTest3 = -1;

        int binaryResult1 = binarySearch(testKey1, testArray1);
        int binaryResult2 = binarySearch(testKey2, testArray2);
        int binaryResult3 = binarySearch(testKey3, testArray3);

        System.out.println("Expected: " + expectedOutPutTest1 + " Result: " + binaryResult1);
        System.out.println("Expected: " + expectedOutPutTest2 + " Result: " + binaryResult2);
        System.out.println("Expected: " + expectedOutPutTest3 + " Result: " + binaryResult3);

    }

   public static int binarySearch(int inputKey, int inputArray[]){
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;

        while(leftIndex < rightIndex){
            int middleIndex = leftIndex + (rightIndex - leftIndex)/2;

            if (inputArray[middleIndex] == inputKey){
                return middleIndex;
            }
            if (inputArray[middleIndex] < inputKey){
                leftIndex = middleIndex + 1;
            }
            else {
                rightIndex = middleIndex - 1;
            }

        }
       return -1;
    }
}