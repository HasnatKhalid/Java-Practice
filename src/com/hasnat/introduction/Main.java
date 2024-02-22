package com.hasnat.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
//        String[] names = new String[5];
//
//        //data of 5 students
//        int[]rno = new int[5];
//        String[] name = new String[5];
//        float[]marks = new float[5];

        Student[] students = new Student[5];

        Student hasnat = new Student();

//        hasnat.rno = 13;
//        hasnat.name = "Hasnat";
//        hasnat.marks = 80;
        hasnat.changeName("Ali");
        hasnat.grgeeting();

        System.out.println(hasnat.rno);
        System.out.println(hasnat.marks);
        System.out.println(hasnat.name);






    }
}
class Student{
    int rno ;
    String name ;
    float marks ;
    void grgeeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }


    Student(){
        this.rno = 13;
        this.name = "Hasnat";
        this.marks = 80;
    }

    Student(int rno , String name, float marks){
        this.rno = 13;
        this.name = "Hasnat";
        this.marks = 80;
    }
}
