package org.example.singletonCodes;
// STATIC BLOCK SINGLETON
public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Error Creating Static block Singleton");
        }
    }

    private StaticBlockSingleton(){
        System.out.println("inside private constructor");
    };

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public static void main(String [] arg){
        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();

        System.out.println(s1==s2);
    }

}
