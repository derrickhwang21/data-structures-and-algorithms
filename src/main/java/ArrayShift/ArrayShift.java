package ArrayShift;

import java.util.Arrays;


public class ArrayShift{
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


        if (originalArray.length < 2){
            return originalArray;
        }else {
            int[] middlelessArray = new int[originalArray.length - 1];
            int midpointIndex = (originalArray.length % 2 == 0 ? originalArray.length / 2 : (originalArray.length + 1) / 2);
            for (int i = 0; i < middlelessArray.length; i++) {
                if (i < midpointIndex) {
                    middlelessArray[i] = originalArray[i];
                } else {
                    middlelessArray[i] = originalArray[i + 1];
                }
            }
            return middlelessArray;
        }

    }
}
