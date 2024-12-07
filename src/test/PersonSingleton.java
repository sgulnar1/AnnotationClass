package test;
//@Singleton
public class PersonSingleton {
    private static PersonSingleton instance;
    private PersonSingleton () {

    }
    public static PersonSingleton getInstance () {
        if(instance == null) {
            instance = new PersonSingleton();
        }
        return instance;
    }

}
