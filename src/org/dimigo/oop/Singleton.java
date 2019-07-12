package org.dimigo.oop;

import javax.swing.plaf.SliderUI;
import java.time.Instant;

public class Singleton {
    private static Singleton instance; // = new Singleton();

    private Singleton(){}

    /*static{
        instance = new Singleton();
    }*/

    public static Singleton getInstance(){
        return instance;
    }

    public static synchronized Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
