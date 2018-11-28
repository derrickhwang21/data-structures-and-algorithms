import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        reverseArray(numbers);
    }

    public static void reverseArray(int[]inputArray){
        for(int i = 0; i < inputArray.length/2; i++){
            int temporaryNumber = inputArray[i];
            inputArray[i] = inputArray[inputArray.length -1 -i];
            inputArray[inputArray.length - 1 - i] = temporaryNumber;

        }
        System.out.println(Arrays.toString(inputArray));
    }

}
