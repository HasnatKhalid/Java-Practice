package com.hasnat.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human hasnat = new Human(22 , "Hasnat" , 10000 , false );
//        Human rahul = new Human(24 , "Rahul" , 15000 , true );
//        Human ali = new Human(24 , "Ali" , 15000 , true );
//
//        System.out.println(Human.population);
//        System.out.println(rahul.population);

        Main funn = new Main();
        funn.fun2();
    }

        static void fun(){

//            greeting();


            Main obj = new Main();
            obj.greeting();
        }

        void fun2(){
        greeting();
        }

        void greeting(){
//        fun();
        System.out.println("Hello World");
    }
}
