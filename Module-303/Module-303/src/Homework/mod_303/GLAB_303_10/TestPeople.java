package Homework.mod_303.GLAB_303_10;

import java.sql.SQLOutput;

public class TestPeople {
    public static void main ( String args[]){
        Person person1;
        Boy jimmy;
        Girl betty;
        person1 = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        //Boy b = new person(); throw error
        // Girl g = new Person(); throw error

        System.out.println(person1);
        System.out.println(person1.talk());
        System.out.println(person1.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        //typecasting
        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println(((Boy)person1).talk());

    }
}
