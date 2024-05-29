package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args ) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(42);

        greetings(person);
    }

    public static void greetings(Person human) {
        System.out.println("Greetings " + human.getFirstName() + " " + human.getLastName() + 
        ". You are " + human.getAge() + " years old.");
    }
}
