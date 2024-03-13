package Obj_Practice;

import java.util.HashMap;
import java.util.Map;

public class practice_Hashmap {
    public static void main(String[] args) {
        Map<String,String>money = new HashMap<String,String>();
        
        money.put("10円", "銅");
        money.put("100円", "銀");
        
        System.out.println(money.get("10円"));
        
         int hashSize = money.size();
         System.out.println(hashSize);

         
    }

}
