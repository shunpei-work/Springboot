package Obj_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practice_List {
    public static void main(String[] args) {
        
        // 行きたい国リスト
        List<String>country = new ArrayList<String>();
        country.add("韓国");
        country.add("アイスランド");
        
        // 指定したデータ取得
        String place = country.get(0);
        System.out.println(place);
        
        // 要素を数える
        System.out.println(country.size());

        // 要素の削除
        country.remove(0);
        // 参照と変数の違い
        System.out.println(place);
        System.out.println(country.get(0));

        // 要素の出力
        Iterator<String>ite = country.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

}
