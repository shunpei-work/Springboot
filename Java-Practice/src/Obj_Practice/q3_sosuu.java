package Obj_Practice;

import java.util.ArrayList;
import java.util.List;

public class q3_sosuu {
    public static void main(String[] args) {
        
        List<Integer>sosuu = new ArrayList<Integer>();
        
        // 1から100までの数表示ループ
        for (int i = 1; i <= 100; i++) {
            if(i == 7 || i == 5 || i == 3 || i == 2) {
                sosuu.add(i);
            }else 
            if(!(i == 1) && !(i % 7 == 0) && !(i % 5 == 0) && !(i % 3 == 0) && !(i % 2 == 0)) {
                sosuu.add(i);
            }
        }
        System.out.println(sosuu);
    }

}
