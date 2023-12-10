package org.example.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

//Comparable can only compare one property of the object at one time...
//comparable also only has one method to override that is toCompare()
class Student implements Comparable<Student>{
    private Integer rollNo;
    private String name;
    private Integer age;


    public Student(Integer rollNo, String name, Integer age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(age == o.age) return 0;
        else if(age > o.age) return 1;
        else return -1;
    }
}
public class ComparableInterfaceJava {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        for(Student st : al){
            System.out.println(st.getRollNo()+" "+st.getName()+" "+st.getRollNo());
        }
    }
}
