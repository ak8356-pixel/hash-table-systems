package hashtablesystems;

import java.util.*;

public class Q5_RealTimeAnalyticsDashboard {

    HashMap<String,Integer> pageViews = new HashMap<>();
    HashMap<String,Set<String>> visitors = new HashMap<>();

    public void processEvent(String url,String user){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        visitors.putIfAbsent(url,new HashSet<>());
        visitors.get(url).add(user);
    }

    public static void main(String[] args){

        Q5_RealTimeAnalyticsDashboard obj = new Q5_RealTimeAnalyticsDashboard();

        obj.processEvent("/news","user1");
        obj.processEvent("/news","user2");

        System.out.println(obj.pageViews);
    }
}
