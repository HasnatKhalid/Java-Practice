package com.hasnat.singleton;

public class singleton {

    private singleton (){

    }
    private static singleton instance;

    public static singleton getInstance(){

        //check wether 1 obj is created or not
        if (instance == null){
            instance = new singleton();

        }
        return instance;

    }
}
