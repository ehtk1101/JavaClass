package org.dimigo.oop;

public class Person {
    //private final String species = "표유류";
    private final String birthDate;
    private String name;
    public static final String SPECIES = "포유류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "species='" + SPECIES + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020101", "아이우");
        Person p2 = new Person("20020101", "김종수");
        System.out.println(p1);
        System.out.println(p2);

        //p1.species = "파충류"; // final은 상수처리되서 바꿀 수 없음
        System.out.println(Person.SPECIES);
    }
}