package edu.guatejug.singleton.example;

/**
 *
 * @author Mario Batres
 */
public class Main {

    public static void main(String[] args) {

        
        DatabaseSingletonEager.getInstance().createQuery("select * from ...");
        
        DatabaseSingletonLazy.getInstance().createQuery("select * from ...");
        
        DatabaseSingletonMultithreaded.getInstance().createQuery("select * from ...");
        
        DatabaseSingletonDoubleCheck.getInstance().createQuery("select * from ...");
        
    }
}
