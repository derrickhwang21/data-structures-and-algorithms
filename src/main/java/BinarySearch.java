

import java.util.Arrays;

public class BinarySearch{

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