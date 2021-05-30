package sk.kosickaakademia.lenart.trylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ahoj");
        list.add("cau");
        list.add("dovidenia");
        list.add("maj sa");
        list.add("zatial");

        //1
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        //2
        System.out.println(list);

        //3
        for(String temp:list) {
            System.out.println(temp + " ");
        }
        System.out.println();

        //4
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        //5
        list.forEach((n)->{
            System.out.println(n+" ");
        });

        //6
        list.forEach(Main ::write);
        System.out.println();

        //vypis 2 mocnin
        list.forEach(Main::power2);
            /*for(Integer temp: list){
                System.out.println(temp+" ");
                if((temp) == (1))
                    list.remove(temp);
            }*/
        // takto to nefunguje
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.sort(list,((o1, o2) -> {
            int ds1=digitSum(o1);
            int ds2=digitSum(o2);
            if(ds1==ds2)
                return 0;
            else if(ds1>ds2)
                return +1;
            else
                return -1;
        }));
        System.out.println(list);
    }

    private static int digitSum(String value){
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static void write(String m){
        System.out.println(m+" ");
    }

    public static void power2(String m){
        System.out.println(m*m+" ");
    }
}
