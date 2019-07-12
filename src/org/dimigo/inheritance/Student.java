package org.dimigo.inheritance;

public class Student extends Person {
    private String studenId;

    public Student(String name, int age, int height, int weight, String studenId) {
        super(name, age, height, weight);
        this.studenId = studenId;
    }

    public void study(){
        System.out.println(super.getName() + "이/가 공부를 한다");
    }

    public void rollCall(){
        System.out.println(getName() + "이/가 점호를 한다");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studenId='" + studenId + '\'' +
                super.toString() +
                "}";
    }
}