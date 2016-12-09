package com.company;

/**
 * Created by VIVA on 09.12.2016.
 */
public class Food extends Thread{
    String kot;

    Food(String str){
        this.kot = str;
    }

    public void run(){
        for(int i = 0;i<660;i++){
            System.out.println(this.kot+" : еще не наелся....");
        }

        System.out.println(this.kot+" : наелся....");
    }

}
