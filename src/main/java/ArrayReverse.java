
public class ArrayReverse {

    public static int[] reverseArray( int[] arrayToReverse){
        int[] reversedArray = new int[arrayToReverse.length];

        for(int i = 0; i < arrayToReverse.length; i++) {
            reversedArray[i] = arrayToReverse[arrayToReverse.length - 1 - i];
        }

        return reversedArray;
    }
}
