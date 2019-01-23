package Hashtable.LeftJoin;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {

    public static String[][] leftJoin(HashMap<String, String> synonymMap, HashMap<String, String> antonymMap){
        List<String> keys = new ArrayList<>(synonymMap.keySet());
        
        String[][]result = new String[keys.size()][3];
        for(int i  = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            result[keys.size() - 1 - i][0] = key;
            result[keys.size() - 1 - i][1] = synonymMap.get(key);
            if (antonymMap.containsKey(key)) {
                result[keys.size() - 1 - i][2] = antonymMap.get(key);
            } else {
                result[keys.size() - 1 - i][2] = null;
            }
        }
        return result;
    }
}
