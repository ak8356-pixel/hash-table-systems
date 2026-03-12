package hashtablesystems;

import java.util.*;

public class Q7_AutocompleteSystem {

    HashMap<String,Integer> frequency = new HashMap<>();

    public void addQuery(String query){
        frequency.put(query,frequency.getOrDefault(query,0)+1);
    }

    public List<String> search(String prefix){

        List<String> result = new ArrayList<>();

        for(String q : frequency.keySet()){
            if(q.startsWith(prefix))
                result.add(q);
        }

        return result;
    }

    public static void main(String[] args){

        Q7_AutocompleteSystem obj = new Q7_AutocompleteSystem();

        obj.addQuery("java tutorial");
        obj.addQuery("javascript");

        System.out.println(obj.search("jav"));
    }
}
