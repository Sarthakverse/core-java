package org.example.collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Student{
    private Integer rollNo;
    private String name;
    private Integer age;

    public Integer getRollNo() {
        return rollNo;
    }

    public Student(Integer rollNo, String name, Integer age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
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
}
public class UserDefinedClassObjectsArrayList {
    public static void main(String [] arg){
        Student s1 = new Student(154,"Sarthak Rastogi",20);
        Student s2 = new Student(155,"Satish Kumar Rana",21);
        Student s3 = new Student(161,"Shivam Adhana",20);
        Student s4 = new Student(173,"Suraj Yadav",20);
        Student s5 = new Student(200,"Yogendra Dayal",21);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }

    }
}
