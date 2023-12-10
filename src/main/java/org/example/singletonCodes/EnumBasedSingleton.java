package org.example.singletonCodes;
//ENUM BASED SINGLETON
public enum EnumBasedSingleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("doing something!!");
    }

    public static void main(String [] arg){
        EnumBasedSingleton.INSTANCE.doSomething();
    }
}
