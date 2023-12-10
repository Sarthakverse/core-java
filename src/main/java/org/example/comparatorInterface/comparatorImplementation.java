package org.example.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1{
    private String name;
    private Integer age;
    private Integer rollNo;

    public String getName() {
        return name;
    }

    public Student1(String name, Integer age, Integer rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
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

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}

class AgeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student1 s1 = (Student1)o1;
        Student1 s2 = (Student1)o2;

        if(s1 == s2) return 0;
        else if(s1.getAge() > s2.getAge()) return 1;
        else return -1;

    }
}

class nameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student1 s1 = (Student1)o1;
        Student1 s2 = (Student1)o2;

        return s1.getName().compareTo(s2.getName());
    }
}
public class comparatorImplementation {
    public static void main(String [] arg){
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("Sarthak",21,154));
        list.add(new Student1("Aman",20,234));
        list.add(new Student1("Abhay",21,237));

        System.out.println("sorting by name");
        list.sort(new nameComparator());
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Student1 st=(Student1)itr.next();
            System.out.println(st.getName()+" "+st.getAge()+" "+st.getRollNo());
        }

        System.out.println("sorting by age");
        Collections.sort(list,new AgeComparator());
        Iterator<Student1> itr1 = list.iterator();
        while(itr1.hasNext()){
            Student1 stu = itr1.next();
            System.out.println(stu.getName()+" "+stu.getRollNo()+" "+stu.getAge());
        }
    }
}
