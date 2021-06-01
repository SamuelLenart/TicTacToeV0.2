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

    public int hashCode(){
        var hashCode = 0;
        for (var i = 0; i < lname.length(); i++){
            var lone = lname.charAt(i);
            if (lone != 'a' && lone != 'e' && lone != 'o' && lone != 'i' && lone != 'u' && lone != 'y'
                    && (lone != 'A' && lone != 'E' && lone != 'O' && lone != 'I' && lone != 'U' && lone != 'Y')){
                hashCode += Math.pow(2, (lname.length() - i - 1));
            }
        }
        return hashCode;
    }
}
