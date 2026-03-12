package hashtablesystems;

import java.util.*;

class TokenBucket{
    int tokens;

    TokenBucket(int limit){
        tokens = limit;
    }
}

public class Q6_DistributedRateLimiter {

    HashMap<String,TokenBucket> clients = new HashMap<>();

    public boolean checkRateLimit(String clientId){

        clients.putIfAbsent(clientId,new TokenBucket(5));

        TokenBucket bucket = clients.get(clientId);

        if(bucket.tokens > 0){
            bucket.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        Q6_DistributedRateLimiter obj = new Q6_DistributedRateLimiter();

        System.out.println(obj.checkRateLimit("client1"));
        System.out.println(obj.checkRateLimit("client1"));
    }
}