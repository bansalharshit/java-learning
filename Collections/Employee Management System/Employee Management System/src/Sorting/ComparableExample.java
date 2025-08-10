package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;
    double balance;

    Student(String name,int age,double balance)
    {
        this.name=name;
        this.age = age;
        this.balance = balance;
    }

    @Override
    public int compareTo(Student object) {
        if(this.name.compareTo(object.name)!=0)
        {
            return this.name.compareTo(object.name);
        }
        return this.age - object.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
public class ComparableExample
{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pooja",28,40000.00));
        students.add(new Student("Neeta",52,45000.00));
        students.add(new Student("Harshit",26,30000.00));
        students.add(new Student("Viany",55,36000.00));
        System.out.println(students);
        Collections.sort(students,new NameComparator());
        System.out.println(students);
        Collections.sort(students,new AgeComparator());
        System.out.println(students);
    }
}
