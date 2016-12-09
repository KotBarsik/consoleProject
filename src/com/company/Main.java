package com.company;

public class Main extends Child{

    public static void main() {
        String kot = "Барсик";

        kot = "Мурзик";


        try {
            Child.start(kot);
        }
        catch (ArithmeticException e) {
            Child.message(e + " Брысь");
        }
        finally {
            if(kot == "Барсик") {
                Child.message("Заходи домой");
            }
        }

        System.out.println("Котята пошлите кушать :)");

        new Food("Барсик").start();
        new Food("Мурзик").start();

        System.out.println("Оба кота едят");
    }
}