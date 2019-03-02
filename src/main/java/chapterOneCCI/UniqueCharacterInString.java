package chapterOneCCI;

public class UniqueCharacterInString {

    public static boolean isStringUnique(String inputString){
        if (inputString.length() > 256){
            return false;
        }
        boolean[] char_set = new boolean[256];

        for (int i = 0; i < inputString.length(); i++){
            int val = inputString.charAt(i);
            if(char_set[val]){
                return false;
            }else{
                char_set[val] = true;
            }
        }
        return true;
    }
}
