package hashtablesystems;

import java.util.*;

/*
Q1: Social Media Username Availability Checker
*/

public class Q1_UsernameAvailabilityChecker {

    HashMap<String,Integer> usernames = new HashMap<>();
    HashMap<String,Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username){
        attempts.put(username, attempts.getOrDefault(username,0)+1);
        return !usernames.containsKey(username);
    }

    public List<String> suggestAlternatives(String username){

        List<String> suggestions = new ArrayList<>();

        for(int i=1;i<=3;i++){
            String alt = username + i;
            if(!usernames.containsKey(alt))
                suggestions.add(alt);
        }

        return suggestions;
    }

    public static void main(String[] args){

        Q1_UsernameAvailabilityChecker obj = new Q1_UsernameAvailabilityChecker();

        obj.usernames.put("john_doe",1);

        System.out.println(obj.checkAvailability("john_doe"));
        System.out.println(obj.suggestAlternatives("john_doe"));
    }
}