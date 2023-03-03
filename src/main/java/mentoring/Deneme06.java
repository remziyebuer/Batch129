package mentoring;


import java.util.ArrayList;
import java.util.List;

public class Deneme06 {
    public static void main(String[] args) {
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(11);
        e.add(15);e.add(34);
        e.add(15);
        e.add(43);

        if(e.contains(15)){
            for (Integer w:e) {
                if(w==15){
                    int idx = e.indexOf(15);
                    e.set(idx,51);
                }
            }
            System.out.println(e);
        }else {
            System.out.println(e);
        }
    }


}