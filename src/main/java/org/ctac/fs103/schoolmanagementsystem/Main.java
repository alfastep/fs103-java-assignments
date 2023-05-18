package org.ctac.fs103.schoolmanagementsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher(1,"John",500);
        Teacher jane = new Teacher(2,"Jane",700);
        Teacher lon = new Teacher(3,"Lon",600);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(john);
        teacherList.add(jane);
        teacherList.add(lon);


        Student lane = new Student(1,"Lane",4);
        Student ron = new Student(2,"Ron",12);
        Student rane = new Student(3,"Rane",5);
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(lane);
        studentList.add(ron);
        studentList.add(rane);




        School shs = new School(teacherList,studentList);

        Teacher shon = new Teacher(6,"Shon", 900);

        shs.addTeacher(shon);


        lane.payFees(5000);
        ron.payFees(6000);
        System.out.println("SHS has earned $"+ shs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        john.receiveSalary(john.getSalary());
        System.out.println("SHS has spent for salary to " + john.getName()
                +" and now has $" + shs.getTotalMoneyEarned());

        lon.receiveSalary(lon.getSalary());
        System.out.println("SHS has spent for salary to " + lon.getName()
                +" and now has $" + shs.getTotalMoneyEarned());


        System.out.println(ron);

        jane.receiveSalary(jane.getSalary());

        System.out.println(jane);


    }
}
