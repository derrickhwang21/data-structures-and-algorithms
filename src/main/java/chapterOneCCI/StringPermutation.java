package chapterOneCCI;

public class StringPermutation {

    public static boolean isStringPermutation(String inputStringOne, String inputStringTwo){

        if(inputStringOne.length() != inputStringTwo.length()){
            return false;
        }

        int[] letters = new int[256];
        char[] stringArray = inputStringOne.toCharArray();
        for (char character : stringArray){
            letters[character]++;
        }

        for(int i = 0; i < inputStringTwo.length(); i++){
            int character = (int) inputStringTwo.charAt(i);
            if(--letters[character] < 0){
                return false;
            }
        }

        return true;

    }



}
