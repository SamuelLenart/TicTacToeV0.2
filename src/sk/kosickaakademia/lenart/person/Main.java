package sk.kosickaakademia.lenart.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jozko","Hrasko",'m',32));
        list.add(new Person("Marko","Hrasko",'m',22));
        list.add(new Person("Samo","Rozsypany",'m',18));
        list.add(new Person("Janka","Mrkvickova",'f',26));
        list.add(new Person("Dominik","Tatarak",'m',78));
        list.add(new Person("Dominika","Hradcova",'f',15));
        list.add(new Person("Silvia","Novakova",'f',25));
        list.add(new Person("Ricahrd","Krajnak",'m',19));
        list.add(new Person("David","Rusniak",'m',15));
        list.add(new Person("Patrik","Hrasko",'m',16));

        printName(list);
        List<Person> listFemale;
        listFemale=list.stream().filter(obj-> obj.getGender()=='f').collect(Collectors.toList());
        System.out.println();

        printName(listFemale);
        list.sort(Comparator.comparingInt(Person::getAge));
        System.out.println();
        printName(list);

        Collections.sort(list,((o1, o2) -> {
            if(o1.getLname().compareToIgnoreCase(o2.getLname())<0)
                return -1;
            else if(o1.getLname().compareToIgnoreCase(o2.getLname())>0)
                return 1;
            else if(o1.getFname().compareToIgnoreCase(o2.getFname())<0)
                return -1;
            else if(o1.getFname().compareToIgnoreCase(o2.getFname())>0)
                return 1;
            return 0;
        }));
        System.out.println();
        printName(list);

        printName(list);
        List<Person> listAge;
        listAge=list.stream().filter(obj-> obj.getAge()==19).collect(Collectors.toList());
        System.out.println();
    }

    private static void printName(List<Person> list) {
        list.forEach((obj)->{
            System.out.println(obj.getFname().charAt(0)+". "+obj.getLname()+" ("+obj.getAge()+")");
        });
    }
}
