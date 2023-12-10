package org.example.singletonCodes;
//EAGER SINGLETON CLASS PATTERN --> early instantiation of class
public class EagerSingleton {
//  instance gets created at loading time
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("inside private constructor");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] arg){
//      doesn't matter how many references you make....they will always point to same instance(ie object)
        EagerSingleton esObj1 = EagerSingleton.getInstance();
        EagerSingleton esObj2 = EagerSingleton.getInstance();

        System.out.println(esObj1 == esObj2); // O/P:- true
    }
}
