public class EjemploSingleton {

    private static EjemploSingleton instance;

    private EjemploSingleton () {}

    public static EjemploSingleton getInstance() {
        if (instance == null) {
            instance = new EjemploSingleton();
        }
        return instance;
    }

    public void showClassName() {
        System.out.println("El nombre de la clase es: " + this.getClass().getSimpleName());
    }
}