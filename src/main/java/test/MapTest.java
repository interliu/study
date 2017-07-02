package test;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> treeMap = new TreeMap<String,String>();
        Map<String,String> linkedMap = new LinkedHashMap<String, String>();

        treeMap.put("b",null);
        treeMap.put("c",null);
        treeMap.put("a",null);

        for (Iterator<String> iter = treeMap.keySet().iterator();iter.hasNext();){
            System.out.println("TreeMap="+iter.next());
        }

        System.out.println("----------分割线---------");

        linkedMap.put("b",null);
        linkedMap.put("c",null);
        linkedMap.put("a",null);

        for (Iterator<String> iter = linkedMap.keySet().iterator();iter.hasNext();){
            System.out.println("LinkedHashMap="+iter.next());
        }
        Double d = 1000001000000000000000000000000000000000000000000000000000000000000000000000000000000000000D;
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(d));
    }
}
