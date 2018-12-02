
public class ArrayReverse {
    public static void main(String[] args) {

        int[] oldList = {1, 2, 3, 4, 5, 6};
        oldList = reverseArray(oldList);

        for(int i = 0; i < oldList.length; i++) {
            System.out.print(oldList[i] + " ");
        }



    }

    public static int[] reverseArray( int[] arrayToReverse){
        int[] reversedArray = new int[arrayToReverse.length];

        for(int i = 0; i < arrayToReverse.length; i++) {
            reversedArray[i] = arrayToReverse[arrayToReverse.length - 1 - i];
        }

        return reversedArray;
    }
}
