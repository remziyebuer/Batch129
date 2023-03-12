package java_core.day33maps;

import java.util.*;

public class Calisma {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Istanbul", 20000000);
        hm.put("Erzincan", 20000000);
        hm.put("kayseri", null);
        hm.put(null, 30000000);
        hm.put(null, 10000000);


        System.out.println(hm);


        //HashMap'lerde sadece "key" leri almak istiyorum

        Set<String> hmkey = hm.keySet();
        System.out.println(hmkey);

        //HashMap'lerde sadece "value" larin toplamini almak istiyorum

        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }
        System.out.println(sum);

        Integer nufus = hm.get("Erzincan");
        System.out.println(nufus);

//
//        Set<Map.Entry<String, Integer>> a =  hm.entrySet();
//        List<Map.Entry<String, Integer>> alist = new ArrayList<>(aset);
//        Map.Entry<String, Integer>aEntry =aEntryList.get(0);
//
//        String ilk = aEntry.getKey();
//        Integer ikinci = aEntry.getValue();



    }
}
