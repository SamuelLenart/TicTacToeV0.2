package sk.kosickaakademia.lenart.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testHashCode() {
        var person = new Person("Samo", "Rozsypany", 'm', 20);
        assertEquals(10, person.hashCode());

        person = new Person("Silvia", "Novakova", 'm', 25);
        assertEquals(37, person.hashCode());

        person = new Person ("David", "Rusniak", 'f', 20);
        assertEquals(31, person.hashCode());

        person = new Person ("Janka", "Mrkvickova", 'f', 20);
        assertEquals(31, person.hashCode());
    }
}