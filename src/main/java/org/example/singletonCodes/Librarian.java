package org.example.singletonCodes;
//SINGLETON DESIGN PATTERN EXAMPLE
public class Librarian
{
//    to create a singleton design pattern three things are must:
//    1--> private static member to limit accessibility
//    2--> private constructor to prevent instance creation out of class
//    3--> method to return the instance(FACTORY METHOD)
    private static Librarian instance;
    private Librarian(){
        System.out.println("Inside private constructor");
    }

    public static Librarian getInstance(){
        if(instance == null){
            synchronized(Librarian.class){
//                synchronized block is necessary to prevent multiple instance creation if two threads
//                access this getInstance function at same time
                if(instance==null){
                    instance = new Librarian();
                }
            }
        }
        return instance;
    }

    public void manageLibrary(){
        System.out.println("managing the library");
    }

    public static void main(String[] arg){
        Librarian lib1 = Librarian.getInstance();
        Librarian lib2 = Librarian.getInstance();

        System.out.println(lib1 == lib2);

        lib1.manageLibrary();
        lib2.manageLibrary();

        }
}
