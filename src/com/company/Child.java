package com.company;

public class Child {

    public static void start (String echo){
        if(echo == "Барсик") {
            System.out.println(" Привет "+echo+" ))");
        }
        else{
            throw new ArithmeticException("Я не знаю кто такой "+echo);
        }
    }

    public static void message(String messages){
        System.out.println(messages);
    }
}

