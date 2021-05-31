package sk.kosickaakademia.lenart.person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jozko","Hrasko",'m',32));
        list.add(new Person("Marko","Hrasko",'m',22));
        list.add(new Person("Samo","Rozsypany",'m',18));
        list.add(new Person("Janka","Mrkvickova",'f',64));
        list.add(new Person("Dominik","Tatarak",'m',78));
        list.add(new Person("Dominika","Hradcova",'f',31));
        list.add(new Person("Silvia","Novakova",'f',25));
        list.add(new Person("Ricahrd","Krajnak",'m',56));
        list.add(new Person("David","Rusniak",'m',48));
        list.add(new Person("Patrik","Hrasko",'m',16));

        printName(list);
        List<Person> listFemale;
        listFemale=list.stream().filter(obj-> obj.getGender()=='f').collect(Collectors.toList());
        System.out.println();
        printName(listFemale);
        list.sort(Comparator.comparingInt(Person::getAge));
    }

    private static void printName(List<Person> list) {
        list.forEach((obj)->{
            System.out.println(obj.getFname().charAt(0)+". "+obj.getLname()+" ("+obj.getAge()+")");
        });
    }
}
