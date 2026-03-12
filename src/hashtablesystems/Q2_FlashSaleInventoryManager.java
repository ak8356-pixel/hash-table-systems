package hashtablesystems;

import java.util.*;

/*
Q2: Flash Sale Inventory Manager
*/

public class Q2_FlashSaleInventoryManager {

    HashMap<String,Integer> stock = new HashMap<>();
    Queue<Integer> waitingList = new LinkedList<>();

    public int checkStock(String productId){
        return stock.getOrDefault(productId,0);
    }

    public void purchaseItem(String productId,int userId){

        int current = stock.getOrDefault(productId,0);

        if(current > 0){
            stock.put(productId,current-1);
            System.out.println("Purchase successful");
        }else{
            waitingList.add(userId);
            System.out.println("Added to waiting list");
        }
    }

    public static void main(String[] args){

        Q2_FlashSaleInventoryManager obj = new Q2_FlashSaleInventoryManager();

        obj.stock.put("IPHONE15",5);

        obj.purchaseItem("IPHONE15",101);
        obj.purchaseItem("IPHONE15",102);

        System.out.println("Stock left: "+obj.checkStock("IPHONE15"));
    }
}