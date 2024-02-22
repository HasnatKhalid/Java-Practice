package com.hasnat.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//
//        Integer num = 45;
//        int b = 20;

        Integer a =10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a +" "+ b);

        A obj = new A("hjdfkjsfshk");
        System.out.println(obj);



    }
    static void swap(Integer a , Integer b ){
        Integer temp = a;
        a=b;
        b=temp;
    }



    static class A{
        final int num =10;
        String name;

        public A(String name) {
            this.name = name;
        }
    }
}
