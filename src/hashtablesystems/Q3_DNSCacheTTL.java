package hashtablesystems;

import java.util.*;

class DNSEntry{
    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class Q3_DNSCacheTTL {

    HashMap<String,DNSEntry> cache = new HashMap<>();

    public String resolve(String domain){

        DNSEntry entry = cache.get(domain);

        if(entry != null && System.currentTimeMillis() < entry.expiry){
            return "Cache HIT: "+entry.ip;
        }

        String ip = "172.217.14.206";

        cache.put(domain,new DNSEntry(ip,5000));

        return "Cache MISS: "+ip;
    }

    public static void main(String[] args){

        Q3_DNSCacheTTL obj = new Q3_DNSCacheTTL();

        System.out.println(obj.resolve("google.com"));
        System.out.println(obj.resolve("google.com"));
    }
}