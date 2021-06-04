package sk.kosickaakademia.lenart.person;

public class Person {
    private String fname;
    private String lname;
    private char gender;
    private int age;

    public Person(String fname, String lname, char gender, int age) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode(){
        var code = 0;
        var sam = "aeiouy";
        for (var i = 0; i < lname.length(); i++){
            var z = lname.toLowerCase().charAt(i);
            if (!sam.contains(String.valueOf(z))) {
                code += Math.pow(2, (lname.length() - i - 1));
            }
        }
        return code;
    }
}
