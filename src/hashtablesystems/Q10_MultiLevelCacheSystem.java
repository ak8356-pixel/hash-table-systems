package hashtablesystems;

import java.util.*;

public class Q10_MultiLevelCacheSystem {

    HashMap<String,String> L1 = new HashMap<>();
    HashMap<String,String> L2 = new HashMap<>();
    HashMap<String,String> DB = new HashMap<>();

    public String getVideo(String id){

        if(L1.containsKey(id))
            return "L1 Cache HIT";

        if(L2.containsKey(id)){
            L1.put(id,L2.get(id));
            return "L2 Cache HIT";
        }

        if(DB.containsKey(id)){
            L2.put(id,DB.get(id));
            return "Database HIT";
        }

        return "Video not found";
    }

    public static void main(String[] args){

        Q10_MultiLevelCacheSystem obj = new Q10_MultiLevelCacheSystem();

        obj.DB.put("video1","data");

        System.out.println(obj.getVideo("video1"));
    }
}